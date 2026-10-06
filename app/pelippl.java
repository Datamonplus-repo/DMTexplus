package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelippl extends GXProcedure
{
   public pelippl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelippl.class ), "" );
   }

   public pelippl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pelippl.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 )
   {
      pelippl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelippl.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pelippl.this.A558HisProFec = aP2[0];
      this.aP2 = aP2;
      pelippl.this.AV15ActuHDR = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV24EmprNom ;
      GXv_char3[0] = AV25UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char1, GXv_char2, GXv_char3) ;
      pelippl.this.A396EmprCod = GXv_char1[0] ;
      pelippl.this.AV24EmprNom = GXv_char2[0] ;
      pelippl.this.AV25UsurCod = GXv_char3[0] ;
      /* Using cursor P01SH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A561HisProLin = P01SH2_A561HisProLin[0] ;
         A129BarCod = P01SH2_A129BarCod[0] ;
         A132BarCodReo = P01SH2_A132BarCodReo[0] ;
         A130BarCodPar = P01SH2_A130BarCodPar[0] ;
         A194BarOrdLin = P01SH2_A194BarOrdLin[0] ;
         A4704HisProNPar = P01SH2_A4704HisProNPar[0] ;
         if ( GXutil.strcmp(AV15ActuHDR, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int5[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            GXv_int6[0] = A194BarOrdLin ;
            GXv_int7[0] = A4704HisProNPar ;
            new app.pparlav8(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_int6, GXv_int7) ;
            pelippl.this.A396EmprCod = GXv_char3[0] ;
            pelippl.this.A129BarCod = GXv_int4[0] ;
            pelippl.this.A132BarCodReo = GXv_int5[0] ;
            pelippl.this.A130BarCodPar = GXv_char2[0] ;
            pelippl.this.A194BarOrdLin = GXv_int6[0] ;
            pelippl.this.A4704HisProNPar = GXv_int7[0] ;
         }
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A602MaqCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char1[0] = A130BarCodPar ;
         GXv_int4[0] = A4704HisProNPar ;
         GXv_int6[0] = A194BarOrdLin ;
         new app.plecfing(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int7, GXv_int5, GXv_char1, GXv_int4, GXv_int6) ;
         pelippl.this.A396EmprCod = GXv_char3[0] ;
         pelippl.this.A602MaqCod = GXv_char2[0] ;
         pelippl.this.A129BarCod = GXv_int7[0] ;
         pelippl.this.A132BarCodReo = GXv_int5[0] ;
         pelippl.this.A130BarCodPar = GXv_char1[0] ;
         pelippl.this.A4704HisProNPar = GXv_int4[0] ;
         pelippl.this.A194BarOrdLin = GXv_int6[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P01SH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A556HisProEst = P01SH3_A556HisProEst[0] ;
         A561HisProLin = P01SH3_A561HisProLin[0] ;
         A130BarCodPar = P01SH3_A130BarCodPar[0] ;
         A129BarCod = P01SH3_A129BarCod[0] ;
         A4704HisProNPar = P01SH3_A4704HisProNPar[0] ;
         A194BarOrdLin = P01SH3_A194BarOrdLin[0] ;
         A1525HisProKgr = P01SH3_A1525HisProKgr[0] ;
         A4714HisProNpzs = P01SH3_A4714HisProNpzs[0] ;
         A132BarCodReo = P01SH3_A132BarCodReo[0] ;
         if ( A556HisProEst != 9 )
         {
            /* Using cursor P01SH4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
            AV26inc_obs = httpContext.getMessage( "Tabla LHIPRO.Eliminacion TODAS las Lineas", "") + GXutil.newLine( ) ;
            AV26inc_obs += httpContext.getMessage( "Maqcod    ", "") + A602MaqCod + GXutil.newLine( ) ;
            AV26inc_obs += httpContext.getMessage( "Hisprofec ", "") + localUtil.dtoc( A558HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
            AV26inc_obs += httpContext.getMessage( "Hisprolin ", "") + GXutil.str( A561HisProLin, 8, 0) + GXutil.newLine( ) ;
            AV26inc_obs += httpContext.getMessage( "OP        ", "") + GXutil.str( A129BarCod, 8, 0) + " " + A130BarCodPar + GXutil.newLine( ) ;
            AV26inc_obs += httpContext.getMessage( "Partida   ", "") + GXutil.str( A4704HisProNPar, 6, 0) + GXutil.newLine( ) ;
            AV26inc_obs += httpContext.getMessage( "BarOrdlin ", "") + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
            AV26inc_obs += httpContext.getMessage( "Prendas   ", "") + GXutil.str( A4714HisProNpzs, 4, 0) + httpContext.getMessage( " Kilos ", "") + GXutil.str( A1525HisProKgr, 9, 2) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV31Pgmname, AV25UsurCod, AV23Station, AV26inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelippl.this.A396EmprCod;
      this.aP1[0] = pelippl.this.A602MaqCod;
      this.aP2[0] = pelippl.this.A558HisProFec;
      this.aP3[0] = pelippl.this.AV15ActuHDR;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelippl");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23Station = "" ;
      AV24EmprNom = "" ;
      AV25UsurCod = "" ;
      scmdbuf = "" ;
      P01SH2_A396EmprCod = new String[] {""} ;
      P01SH2_A602MaqCod = new String[] {""} ;
      P01SH2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01SH2_A561HisProLin = new int[1] ;
      P01SH2_A129BarCod = new int[1] ;
      P01SH2_A132BarCodReo = new byte[1] ;
      P01SH2_A130BarCodPar = new String[] {""} ;
      P01SH2_A194BarOrdLin = new short[1] ;
      P01SH2_A4704HisProNPar = new int[1] ;
      A130BarCodPar = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int6 = new short[1] ;
      P01SH3_A396EmprCod = new String[] {""} ;
      P01SH3_A602MaqCod = new String[] {""} ;
      P01SH3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01SH3_A556HisProEst = new byte[1] ;
      P01SH3_A561HisProLin = new int[1] ;
      P01SH3_A130BarCodPar = new String[] {""} ;
      P01SH3_A129BarCod = new int[1] ;
      P01SH3_A4704HisProNPar = new int[1] ;
      P01SH3_A194BarOrdLin = new short[1] ;
      P01SH3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SH3_A4714HisProNpzs = new short[1] ;
      P01SH3_A132BarCodReo = new byte[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      AV26inc_obs = "" ;
      AV31Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelippl__default(),
         new Object[] {
             new Object[] {
            P01SH2_A396EmprCod, P01SH2_A602MaqCod, P01SH2_A558HisProFec, P01SH2_A561HisProLin, P01SH2_A129BarCod, P01SH2_A132BarCodReo, P01SH2_A130BarCodPar, P01SH2_A194BarOrdLin, P01SH2_A4704HisProNPar
            }
            , new Object[] {
            P01SH3_A396EmprCod, P01SH3_A602MaqCod, P01SH3_A558HisProFec, P01SH3_A556HisProEst, P01SH3_A561HisProLin, P01SH3_A130BarCodPar, P01SH3_A129BarCod, P01SH3_A4704HisProNPar, P01SH3_A194BarOrdLin, P01SH3_A1525HisProKgr,
            P01SH3_A4714HisProNpzs, P01SH3_A132BarCodReo
            }
            , new Object[] {
            }
         }
      );
      AV31Pgmname = "PELIPPL" ;
      /* GeneXus formulas. */
      AV31Pgmname = "PELIPPL" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private byte A556HisProEst ;
   private short A194BarOrdLin ;
   private short GXv_int6[] ;
   private short A4714HisProNpzs ;
   private short Gx_err ;
   private int A561HisProLin ;
   private int A129BarCod ;
   private int A4704HisProNPar ;
   private int GXv_int7[] ;
   private int GXv_int4[] ;
   private java.math.BigDecimal A1525HisProKgr ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV15ActuHDR ;
   private String AV23Station ;
   private String AV24EmprNom ;
   private String AV25UsurCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV31Pgmname ;
   private java.util.Date A558HisProFec ;
   private String AV26inc_obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01SH2_A396EmprCod ;
   private String[] P01SH2_A602MaqCod ;
   private java.util.Date[] P01SH2_A558HisProFec ;
   private int[] P01SH2_A561HisProLin ;
   private int[] P01SH2_A129BarCod ;
   private byte[] P01SH2_A132BarCodReo ;
   private String[] P01SH2_A130BarCodPar ;
   private short[] P01SH2_A194BarOrdLin ;
   private int[] P01SH2_A4704HisProNPar ;
   private String[] P01SH3_A396EmprCod ;
   private String[] P01SH3_A602MaqCod ;
   private java.util.Date[] P01SH3_A558HisProFec ;
   private byte[] P01SH3_A556HisProEst ;
   private int[] P01SH3_A561HisProLin ;
   private String[] P01SH3_A130BarCodPar ;
   private int[] P01SH3_A129BarCod ;
   private int[] P01SH3_A4704HisProNPar ;
   private short[] P01SH3_A194BarOrdLin ;
   private java.math.BigDecimal[] P01SH3_A1525HisProKgr ;
   private short[] P01SH3_A4714HisProNpzs ;
   private byte[] P01SH3_A132BarCodReo ;
}

final  class pelippl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01SH2", "SELECT EmprCod, MaqCod, HisProFec, HisProLin, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProNPar FROM TXPLHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01SH3", "SELECT EmprCod, MaqCod, HisProFec, HisProEst, HisProLin, BarCodPar, BarCod, HisProNPar, BarOrdLin, HisProKgr, HisProNpzs, BarCodReo FROM TXPLHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01SH4", "DELETE FROM TXPLHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

