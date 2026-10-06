package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumpzsd extends GXProcedure
{
   public pnumpzsd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumpzsd.class ), "" );
   }

   public pnumpzsd( int remoteHandle ,
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
      pnumpzsd.this.aP5 = new String[] {""};
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
      pnumpzsd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumpzsd.this.A2809MetTerCod = aP1[0];
      this.aP1 = aP1;
      pnumpzsd.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pnumpzsd.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pnumpzsd.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pnumpzsd.this.AV28MetPieObs = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV25NumPzsFs ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NPFF", ""), GXv_int2) ;
      pnumpzsd.this.GXt_int1 = GXv_int2[0] ;
      AV25NumPzsFs = GXt_int1 ;
      GXt_int1 = AV26NumPzsFs2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NPFF2", ""), GXv_int2) ;
      pnumpzsd.this.GXt_int1 = GXv_int2[0] ;
      AV26NumPzsFs2 = GXt_int1 ;
      AV27Barordlin = (short)(GXutil.lval( GXutil.trim( GXutil.substring( AV28MetPieObs, 18, 8)))) ;
      if ( ( AV25NumPzsFs == 1 ) || ( AV26NumPzsFs2 == 1 ) )
      {
         /* Using cursor P04OO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4917MetPieObs = P04OO2_A4917MetPieObs[0] ;
            A2813MetPieCod = P04OO2_A2813MetPieCod[0] ;
            AV29ValNum = (short)(GXutil.lval( GXutil.trim( GXutil.substring( A4917MetPieObs, 18, 8)))) ;
            if ( AV29ValNum == AV27Barordlin )
            {
               /* Using cursor P04OO3 */
               pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         /* Optimized DELETE. */
         /* Using cursor P04OO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         /* End optimized DELETE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumpzsd.this.A396EmprCod;
      this.aP1[0] = pnumpzsd.this.A2809MetTerCod;
      this.aP2[0] = pnumpzsd.this.A129BarCod;
      this.aP3[0] = pnumpzsd.this.A132BarCodReo;
      this.aP4[0] = pnumpzsd.this.A130BarCodPar;
      this.aP5[0] = pnumpzsd.this.AV28MetPieObs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P04OO2_A396EmprCod = new String[] {""} ;
      P04OO2_A2809MetTerCod = new String[] {""} ;
      P04OO2_A129BarCod = new int[1] ;
      P04OO2_A132BarCodReo = new byte[1] ;
      P04OO2_A130BarCodPar = new String[] {""} ;
      P04OO2_A4917MetPieObs = new String[] {""} ;
      P04OO2_A2813MetPieCod = new String[] {""} ;
      A4917MetPieObs = "" ;
      A2813MetPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumpzsd__default(),
         new Object[] {
             new Object[] {
            P04OO2_A396EmprCod, P04OO2_A2809MetTerCod, P04OO2_A129BarCod, P04OO2_A132BarCodReo, P04OO2_A130BarCodPar, P04OO2_A4917MetPieObs, P04OO2_A2813MetPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV25NumPzsFs ;
   private byte AV26NumPzsFs2 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
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
   private String[] P04OO2_A396EmprCod ;
   private String[] P04OO2_A2809MetTerCod ;
   private int[] P04OO2_A129BarCod ;
   private byte[] P04OO2_A132BarCodReo ;
   private String[] P04OO2_A130BarCodPar ;
   private String[] P04OO2_A4917MetPieObs ;
   private String[] P04OO2_A2813MetPieCod ;
}

final  class pnumpzsd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04OO2", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieObs, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04OO3", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
         ,new UpdateCursor("P04OO4", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

