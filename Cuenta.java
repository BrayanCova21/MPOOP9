public class Cuenta
{
  private double saldo;
  int i=1;
  public Cuenta()
  {
    saldo=0;
  }

  public void Depositar(double monto)throws SaldoTopeException
  {
    System.out.println("Depositando..."+ monto);
    if(monto>=20000)
      throw new SaldoTopeException();
    else
      saldo+=monto;
  }

  public void Retirar(double monto) throws SaldoInsuficienteException, RetirosMaximoException
  {
    if(i<=3)
    {
      System.out.println("Retirando..."+monto);
      if(saldo<monto)
        throw new SaldoInsuficienteException();
      else
      {
        saldo-=monto;
        i++;
      }
    }
    else
    {
      throw new RetirosMaximoException();
    }
  }

  public double consultaSaldo()
  {
    System.out.println("Tu saldo es:"+saldo);
    return saldo;
  }


}