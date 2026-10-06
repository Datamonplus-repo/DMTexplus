package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaamet extends GXProcedure
{
   public pclaamet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaamet.class ), "" );
   }

   public pclaamet( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 )
   {
      pclaamet.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      pclaamet.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaamet.this.AV11Descrip = aP1[0];
      this.aP1 = aP1;
      pclaamet.this.AV12Clave = aP2[0];
      this.aP2 = aP2;
      pclaamet.this.AV27PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaamet.this.AV13BarCod = aP4[0];
      this.aP4 = aP4;
      pclaamet.this.AV14BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclaamet.this.AV15BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclaamet.this.AV21BarLinMaq = aP7[0];
      this.aP7 = aP7;
      pclaamet.this.AV16Accion = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17AcMet = " " ;
      AV27PrdVal = (byte)(0) ;
      AV17AcMet = GXutil.rtrim( GXutil.substring( AV12Clave, 5, 1)) ;
      AV16Accion = GXutil.substring( AV12Clave, 7, 1) ;
      /* Using cursor P02NP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02NP2_A130BarCodPar[0] ;
         A132BarCodReo = P02NP2_A132BarCodReo[0] ;
         A129BarCod = P02NP2_A129BarCod[0] ;
         A5253BarAcc = P02NP2_A5253BarAcc[0] ;
         if ( ( GXutil.strcmp(A5253BarAcc, AV17AcMet) == 0 ) || ( GXutil.strcmp(AV17AcMet, httpContext.getMessage( "T", "")) == 0 ) )
         {
            AV27PrdVal = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaamet.this.A396EmprCod;
      this.aP1[0] = pclaamet.this.AV11Descrip;
      this.aP2[0] = pclaamet.this.AV12Clave;
      this.aP3[0] = pclaamet.this.AV27PrdVal;
      this.aP4[0] = pclaamet.this.AV13BarCod;
      this.aP5[0] = pclaamet.this.AV14BarCodReo;
      this.aP6[0] = pclaamet.this.AV15BarCodPar;
      this.aP7[0] = pclaamet.this.AV21BarLinMaq;
      this.aP8[0] = pclaamet.this.AV16Accion;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17AcMet = "" ;
      scmdbuf = "" ;
      P02NP2_A396EmprCod = new String[] {""} ;
      P02NP2_A130BarCodPar = new String[] {""} ;
      P02NP2_A132BarCodReo = new byte[1] ;
      P02NP2_A129BarCod = new int[1] ;
      P02NP2_A5253BarAcc = new String[] {""} ;
      A130BarCodPar = "" ;
      A5253BarAcc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaamet__default(),
         new Object[] {
             new Object[] {
            P02NP2_A396EmprCod, P02NP2_A130BarCodPar, P02NP2_A132BarCodReo, P02NP2_A129BarCod, P02NP2_A5253BarAcc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27PrdVal ;
   private byte AV14BarCodReo ;
   private byte A132BarCodReo ;
   private short AV21BarLinMaq ;
   private short Gx_err ;
   private int AV13BarCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV11Descrip ;
   private String AV12Clave ;
   private String AV15BarCodPar ;
   private String AV16Accion ;
   private String AV17AcMet ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A5253BarAcc ;
   private String[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P02NP2_A396EmprCod ;
   private String[] P02NP2_A130BarCodPar ;
   private byte[] P02NP2_A132BarCodReo ;
   private int[] P02NP2_A129BarCod ;
   private String[] P02NP2_A5253BarAcc ;
}

final  class pclaamet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02NP2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAcc FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

