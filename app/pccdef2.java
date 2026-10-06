package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccdef2 extends GXProcedure
{
   public pccdef2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccdef2.class ), "" );
   }

   public pccdef2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pccdef2.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pccdef2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccdef2.this.A4031CCTCod = aP1[0];
      this.aP1 = aP1;
      pccdef2.this.A4034CCTLin = aP2[0];
      this.aP2 = aP2;
      pccdef2.this.AV8Valor_d = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Valor_d = "" ;
      /* Using cursor P01XH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4051CCTVal = P01XH2_A4051CCTVal[0] ;
         A4050CCTValDsc = P01XH2_A4050CCTValDsc[0] ;
         A4049CCTValLin = P01XH2_A4049CCTValLin[0] ;
         AV8Valor_d += A4050CCTValDsc + "=" + A4051CCTVal ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccdef2.this.A396EmprCod;
      this.aP1[0] = pccdef2.this.A4031CCTCod;
      this.aP2[0] = pccdef2.this.A4034CCTLin;
      this.aP3[0] = pccdef2.this.AV8Valor_d;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01XH2_A396EmprCod = new String[] {""} ;
      P01XH2_A4031CCTCod = new int[1] ;
      P01XH2_A4034CCTLin = new short[1] ;
      P01XH2_A4051CCTVal = new String[] {""} ;
      P01XH2_A4050CCTValDsc = new String[] {""} ;
      P01XH2_A4049CCTValLin = new byte[1] ;
      A4051CCTVal = "" ;
      A4050CCTValDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccdef2__default(),
         new Object[] {
             new Object[] {
            P01XH2_A396EmprCod, P01XH2_A4031CCTCod, P01XH2_A4034CCTLin, P01XH2_A4051CCTVal, P01XH2_A4050CCTValDsc, P01XH2_A4049CCTValLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4049CCTValLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private String AV8Valor_d ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01XH2_A396EmprCod ;
   private int[] P01XH2_A4031CCTCod ;
   private short[] P01XH2_A4034CCTLin ;
   private String[] P01XH2_A4051CCTVal ;
   private String[] P01XH2_A4050CCTValDsc ;
   private byte[] P01XH2_A4049CCTValLin ;
}

final  class pccdef2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01XH2", "SELECT EmprCod, CCTCod, CCTLin, CCTVal, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

