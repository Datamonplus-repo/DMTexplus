package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwbollb extends GXProcedure
{
   public pwbollb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwbollb.class ), "" );
   }

   public pwbollb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      pwbollb.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pwbollb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pwbollb.this.AV18Maqcod = aP1[0];
      this.aP1 = aP1;
      pwbollb.this.AV8Hisprofec = aP2[0];
      this.aP2 = aP2;
      pwbollb.this.AV9Hisprolin = aP3[0];
      this.aP3 = aP3;
      pwbollb.this.AV19Station = aP4[0];
      this.aP4 = aP4;
      pwbollb.this.AV20Usurcod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03G52 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV18Maqcod, AV8Hisprofec, Integer.valueOf(AV9Hisprolin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A561HisProLin = P03G52_A561HisProLin[0] ;
         A558HisProFec = P03G52_A558HisProFec[0] ;
         A602MaqCod = P03G52_A602MaqCod[0] ;
         A4441HisProDTF = P03G52_A4441HisProDTF[0] ;
         n4441HisProDTF = P03G52_n4441HisProDTF[0] ;
         A4440HisProDTI = P03G52_A4440HisProDTI[0] ;
         n4440HisProDTI = P03G52_n4440HisProDTI[0] ;
         A557HisProF = P03G52_A557HisProF[0] ;
         A566HisProTur = P03G52_A566HisProTur[0] ;
         A1526HisProMtr = P03G52_A1526HisProMtr[0] ;
         A1525HisProKgr = P03G52_A1525HisProKgr[0] ;
         A194BarOrdLin = P03G52_A194BarOrdLin[0] ;
         A503GruOpeCod = P03G52_A503GruOpeCod[0] ;
         A129BarCod = P03G52_A129BarCod[0] ;
         A132BarCodReo = P03G52_A132BarCodReo[0] ;
         A130BarCodPar = P03G52_A130BarCodPar[0] ;
         /* Optimized DELETE. */
         /* Using cursor P03G53 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISPZS");
         /* End optimized DELETE. */
         AV21Texto_i = httpContext.getMessage( "Elimino Linea", "") + httpContext.getMessage( " Usuario=", "") + AV20Usurcod + httpContext.getMessage( " Terminal=", "") + AV19Station + httpContext.getMessage( " Linea=", "") + GXutil.str( A561HisProLin, 8, 0) + httpContext.getMessage( " Operario=", "") + GXutil.str( A503GruOpeCod, 6, 0) + httpContext.getMessage( " Orden=", "") + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( " Kgs=", "") + GXutil.str( A1525HisProKgr, 9, 2) + httpContext.getMessage( " Mts  =", "") + GXutil.str( A1526HisProMtr, 9, 2) + httpContext.getMessage( " Turno=", "") + GXutil.str( A566HisProTur, 1, 0) + httpContext.getMessage( " Fin=", "") + A557HisProF + httpContext.getMessage( " Inicio=", "") + localUtil.ttoc( A4440HisProDTI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Fin=", "") + localUtil.ttoc( A4441HisProDTF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV27Pgmname, AV20Usurcod, AV19Station, AV21Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P03G54 */
         pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwbollb.this.A396EmprCod;
      this.aP1[0] = pwbollb.this.AV18Maqcod;
      this.aP2[0] = pwbollb.this.AV8Hisprofec;
      this.aP3[0] = pwbollb.this.AV9Hisprolin;
      this.aP4[0] = pwbollb.this.AV19Station;
      this.aP5[0] = pwbollb.this.AV20Usurcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "lectoroptico.pwbollb");
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
      P03G52_A396EmprCod = new String[] {""} ;
      P03G52_A561HisProLin = new int[1] ;
      P03G52_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03G52_A602MaqCod = new String[] {""} ;
      P03G52_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P03G52_n4441HisProDTF = new boolean[] {false} ;
      P03G52_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P03G52_n4440HisProDTI = new boolean[] {false} ;
      P03G52_A557HisProF = new String[] {""} ;
      P03G52_A566HisProTur = new byte[1] ;
      P03G52_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03G52_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03G52_A194BarOrdLin = new short[1] ;
      P03G52_A503GruOpeCod = new int[1] ;
      P03G52_A129BarCod = new int[1] ;
      P03G52_A132BarCodReo = new byte[1] ;
      P03G52_A130BarCodPar = new String[] {""} ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV21Texto_i = "" ;
      AV27Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.pwbollb__default(),
         new Object[] {
             new Object[] {
            P03G52_A396EmprCod, P03G52_A561HisProLin, P03G52_A558HisProFec, P03G52_A602MaqCod, P03G52_A4441HisProDTF, P03G52_n4441HisProDTF, P03G52_A4440HisProDTI, P03G52_n4440HisProDTI, P03G52_A557HisProF, P03G52_A566HisProTur,
            P03G52_A1526HisProMtr, P03G52_A1525HisProKgr, P03G52_A194BarOrdLin, P03G52_A503GruOpeCod, P03G52_A129BarCod, P03G52_A132BarCodReo, P03G52_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV27Pgmname = "LectorOptico.PWBOLLb" ;
      /* GeneXus formulas. */
      AV27Pgmname = "LectorOptico.PWBOLLb" ;
      Gx_err = (short)(0) ;
   }

   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV9Hisprolin ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private String A396EmprCod ;
   private String AV18Maqcod ;
   private String AV19Station ;
   private String AV20Usurcod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A557HisProF ;
   private String A130BarCodPar ;
   private String AV27Pgmname ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date AV8Hisprofec ;
   private java.util.Date A558HisProFec ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private String AV21Texto_i ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P03G52_A396EmprCod ;
   private int[] P03G52_A561HisProLin ;
   private java.util.Date[] P03G52_A558HisProFec ;
   private String[] P03G52_A602MaqCod ;
   private java.util.Date[] P03G52_A4441HisProDTF ;
   private boolean[] P03G52_n4441HisProDTF ;
   private java.util.Date[] P03G52_A4440HisProDTI ;
   private boolean[] P03G52_n4440HisProDTI ;
   private String[] P03G52_A557HisProF ;
   private byte[] P03G52_A566HisProTur ;
   private java.math.BigDecimal[] P03G52_A1526HisProMtr ;
   private java.math.BigDecimal[] P03G52_A1525HisProKgr ;
   private short[] P03G52_A194BarOrdLin ;
   private int[] P03G52_A503GruOpeCod ;
   private int[] P03G52_A129BarCod ;
   private byte[] P03G52_A132BarCodReo ;
   private String[] P03G52_A130BarCodPar ;
}

final  class pwbollb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03G52", "SELECT EmprCod, HisProLin, HisProFec, MaqCod, HisProDTF, HisProDTI, HisProF, HisProTur, HisProMtr, HisProKgr, BarOrdLin, GruOpeCod, BarCod, BarCodReo, BarCodPar FROM TXPLHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03G53", "DELETE FROM TXPHISPZS  WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISPZS")
         ,new UpdateCursor("P03G54", "DELETE FROM TXPLHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
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

