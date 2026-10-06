package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumpzsl extends GXProcedure
{
   public pnumpzsl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumpzsl.class ), "" );
   }

   public pnumpzsl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pnumpzsl.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pnumpzsl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumpzsl.this.A2809MetTerCod = aP1[0];
      this.aP1 = aP1;
      pnumpzsl.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pnumpzsl.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pnumpzsl.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pnumpzsl.this.AV28MetPieObs = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Barordlin = (short)(GXutil.lval( GXutil.substring( AV28MetPieObs, 18, 8))) ;
      /* Using cursor P04P42 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4917MetPieObs = P04P42_A4917MetPieObs[0] ;
         A2813MetPieCod = P04P42_A2813MetPieCod[0] ;
         AV29ValNum = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
         if ( AV29ValNum == AV27Barordlin )
         {
            /* Using cursor P04P43 */
            pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumpzsl.this.A396EmprCod;
      this.aP1[0] = pnumpzsl.this.A2809MetTerCod;
      this.aP2[0] = pnumpzsl.this.A129BarCod;
      this.aP3[0] = pnumpzsl.this.A132BarCodReo;
      this.aP4[0] = pnumpzsl.this.A130BarCodPar;
      this.aP5[0] = pnumpzsl.this.AV28MetPieObs;
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
      P04P42_A396EmprCod = new String[] {""} ;
      P04P42_A2809MetTerCod = new String[] {""} ;
      P04P42_A129BarCod = new int[1] ;
      P04P42_A132BarCodReo = new byte[1] ;
      P04P42_A130BarCodPar = new String[] {""} ;
      P04P42_A4917MetPieObs = new String[] {""} ;
      P04P42_A2813MetPieCod = new String[] {""} ;
      A4917MetPieObs = "" ;
      A2813MetPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumpzsl__default(),
         new Object[] {
             new Object[] {
            P04P42_A396EmprCod, P04P42_A2809MetTerCod, P04P42_A129BarCod, P04P42_A132BarCodReo, P04P42_A130BarCodPar, P04P42_A4917MetPieObs, P04P42_A2813MetPieCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV27Barordlin ;
   private short AV29ValNum ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2813MetPieCod ;
   private String AV28MetPieObs ;
   private String A4917MetPieObs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04P42_A396EmprCod ;
   private String[] P04P42_A2809MetTerCod ;
   private int[] P04P42_A129BarCod ;
   private byte[] P04P42_A132BarCodReo ;
   private String[] P04P42_A130BarCodPar ;
   private String[] P04P42_A4917MetPieObs ;
   private String[] P04P42_A2813MetPieCod ;
}

final  class pnumpzsl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04P42", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieObs, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04P43", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

