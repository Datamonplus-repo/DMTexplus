package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctlpmod extends GXProcedure
{
   public pctlpmod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctlpmod.class ), "" );
   }

   public pctlpmod( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pctlpmod.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pctlpmod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctlpmod.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pctlpmod.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pctlpmod.this.AV11TipCol = aP3[0];
      this.aP3 = aP3;
      pctlpmod.this.AV8IntCod = aP4[0];
      this.aP4 = aP4;
      pctlpmod.this.AV19ArtPreUlAc = aP5[0];
      this.aP5 = aP5;
      pctlpmod.this.AV20ArtPreUsrM = aP6[0];
      this.aP6 = aP6;
      pctlpmod.this.AV9texto = aP7[0];
      this.aP7 = aP7;
      pctlpmod.this.AV10opcion = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV10opcion, "1") == 0 )
      {
         /* Execute user subroutine: 'RECINT' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV10opcion, "2") == 0 )
      {
         /* Execute user subroutine: 'RECARG' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV10opcion, "3") == 0 )
      {
         /* Execute user subroutine: 'PREGUNTA' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'RECINT' Routine */
      returnInSub = false ;
      AV9texto = GXutil.space( (short)(700)) ;
      /* Using cursor P01952 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV11TipCol), Byte.valueOf(AV8IntCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P01952_A583IntCod[0] ;
         A831TipColCod = P01952_A831TipColCod[0] ;
         A4325RecIOB = P01952_A4325RecIOB[0] ;
         n4325RecIOB = P01952_n4325RecIOB[0] ;
         A4324RecIPor = P01952_A4324RecIPor[0] ;
         n4324RecIPor = P01952_n4324RecIPor[0] ;
         A4323RecIImp = P01952_A4323RecIImp[0] ;
         n4323RecIImp = P01952_n4323RecIImp[0] ;
         A4322Limite5 = P01952_A4322Limite5[0] ;
         AV9texto += GXutil.str( A4322Limite5, 4, 0) + GXutil.str( A4323RecIImp, 10, 5) + GXutil.str( A4324RecIPor, 6, 2) + A4325RecIOB ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'RECARG' Routine */
      returnInSub = false ;
      AV9texto = GXutil.space( (short)(700)) ;
      /* Using cursor P01953 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A675PorRec = P01953_A675PorRec[0] ;
         n675PorRec = P01953_n675PorRec[0] ;
         A596LimUni = P01953_A596LimUni[0] ;
         n596LimUni = P01953_n596LimUni[0] ;
         A598LinRec = P01953_A598LinRec[0] ;
         AV9texto += GXutil.str( A598LinRec, 2, 0) + GXutil.str( A596LimUni, 8, 0) + GXutil.str( A675PorRec, 6, 2) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S131( )
   {
      /* 'PREGUNTA' Routine */
      returnInSub = false ;
      /* Using cursor P01954 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4351ArtPreUlAc = P01954_A4351ArtPreUlAc[0] ;
         n4351ArtPreUlAc = P01954_n4351ArtPreUlAc[0] ;
         AV14ArtpreCar = localUtil.dtoc( A4351ArtPreUlAc, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      AV12pregunta = httpContext.getMessage( "Fecha ult. precio:", "") + AV14ArtpreCar + httpContext.getMessage( ".     ¿Actualiza a ", "") + localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " ?" ;
      if ( GXutil.strcmp(AV13Flag, httpContext.getMessage( "S", "")) == 0 )
      {
         AV15Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV18EmprCod ;
         GXv_char2[0] = AV16EmprNom ;
         GXv_char3[0] = AV17UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char1, GXv_char2, GXv_char3) ;
         pctlpmod.this.AV18EmprCod = GXv_char1[0] ;
         pctlpmod.this.AV16EmprNom = GXv_char2[0] ;
         pctlpmod.this.AV17UsurCod = GXv_char3[0] ;
         /* Using cursor P01955 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A4351ArtPreUlAc = P01955_A4351ArtPreUlAc[0] ;
            n4351ArtPreUlAc = P01955_n4351ArtPreUlAc[0] ;
            A4352ArtPreUsrM = P01955_A4352ArtPreUsrM[0] ;
            n4352ArtPreUsrM = P01955_n4352ArtPreUsrM[0] ;
            A4351ArtPreUlAc = Gx_date ;
            n4351ArtPreUlAc = false ;
            A4352ArtPreUsrM = AV17UsurCod ;
            n4352ArtPreUsrM = false ;
            AV19ArtPreUlAc = A4351ArtPreUlAc ;
            AV20ArtPreUsrM = A4352ArtPreUsrM ;
            /* Using cursor P01956 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n4351ArtPreUlAc), A4351ArtPreUlAc, Boolean.valueOf(n4352ArtPreUsrM), A4352ArtPreUsrM, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctlpmod.this.A396EmprCod;
      this.aP1[0] = pctlpmod.this.A252CliCod;
      this.aP2[0] = pctlpmod.this.A65ArtCod;
      this.aP3[0] = pctlpmod.this.AV11TipCol;
      this.aP4[0] = pctlpmod.this.AV8IntCod;
      this.aP5[0] = pctlpmod.this.AV19ArtPreUlAc;
      this.aP6[0] = pctlpmod.this.AV20ArtPreUsrM;
      this.aP7[0] = pctlpmod.this.AV9texto;
      this.aP8[0] = pctlpmod.this.AV10opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pctlpmod");
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
      P01952_A396EmprCod = new String[] {""} ;
      P01952_A252CliCod = new int[1] ;
      P01952_A65ArtCod = new String[] {""} ;
      P01952_A583IntCod = new byte[1] ;
      P01952_A831TipColCod = new byte[1] ;
      P01952_A4325RecIOB = new String[] {""} ;
      P01952_n4325RecIOB = new boolean[] {false} ;
      P01952_A4324RecIPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01952_n4324RecIPor = new boolean[] {false} ;
      P01952_A4323RecIImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01952_n4323RecIImp = new boolean[] {false} ;
      P01952_A4322Limite5 = new short[1] ;
      A4325RecIOB = "" ;
      A4324RecIPor = DecimalUtil.ZERO ;
      A4323RecIImp = DecimalUtil.ZERO ;
      P01953_A396EmprCod = new String[] {""} ;
      P01953_A252CliCod = new int[1] ;
      P01953_A65ArtCod = new String[] {""} ;
      P01953_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01953_n675PorRec = new boolean[] {false} ;
      P01953_A596LimUni = new int[1] ;
      P01953_n596LimUni = new boolean[] {false} ;
      P01953_A598LinRec = new byte[1] ;
      A675PorRec = DecimalUtil.ZERO ;
      P01954_A396EmprCod = new String[] {""} ;
      P01954_A252CliCod = new int[1] ;
      P01954_A65ArtCod = new String[] {""} ;
      P01954_A4351ArtPreUlAc = new java.util.Date[] {GXutil.nullDate()} ;
      P01954_n4351ArtPreUlAc = new boolean[] {false} ;
      A4351ArtPreUlAc = GXutil.nullDate() ;
      AV14ArtpreCar = "" ;
      AV12pregunta = "" ;
      Gx_date = GXutil.nullDate() ;
      AV13Flag = "" ;
      AV15Station = "" ;
      AV18EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV17UsurCod = "" ;
      GXv_char3 = new String[1] ;
      P01955_A396EmprCod = new String[] {""} ;
      P01955_A252CliCod = new int[1] ;
      P01955_A65ArtCod = new String[] {""} ;
      P01955_A4351ArtPreUlAc = new java.util.Date[] {GXutil.nullDate()} ;
      P01955_n4351ArtPreUlAc = new boolean[] {false} ;
      P01955_A4352ArtPreUsrM = new String[] {""} ;
      P01955_n4352ArtPreUsrM = new boolean[] {false} ;
      A4352ArtPreUsrM = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctlpmod__default(),
         new Object[] {
             new Object[] {
            P01952_A396EmprCod, P01952_A252CliCod, P01952_A65ArtCod, P01952_A583IntCod, P01952_A831TipColCod, P01952_A4325RecIOB, P01952_n4325RecIOB, P01952_A4324RecIPor, P01952_n4324RecIPor, P01952_A4323RecIImp,
            P01952_n4323RecIImp, P01952_A4322Limite5
            }
            , new Object[] {
            P01953_A396EmprCod, P01953_A252CliCod, P01953_A65ArtCod, P01953_A675PorRec, P01953_n675PorRec, P01953_A596LimUni, P01953_n596LimUni, P01953_A598LinRec
            }
            , new Object[] {
            P01954_A396EmprCod, P01954_A252CliCod, P01954_A65ArtCod, P01954_A4351ArtPreUlAc, P01954_n4351ArtPreUlAc
            }
            , new Object[] {
            P01955_A396EmprCod, P01955_A252CliCod, P01955_A65ArtCod, P01955_A4351ArtPreUlAc, P01955_n4351ArtPreUlAc, P01955_A4352ArtPreUsrM, P01955_n4352ArtPreUsrM
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV11TipCol ;
   private byte AV8IntCod ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte A598LinRec ;
   private short A4322Limite5 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A596LimUni ;
   private java.math.BigDecimal A4324RecIPor ;
   private java.math.BigDecimal A4323RecIImp ;
   private java.math.BigDecimal A675PorRec ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV20ArtPreUsrM ;
   private String AV9texto ;
   private String AV10opcion ;
   private String scmdbuf ;
   private String A4325RecIOB ;
   private String AV14ArtpreCar ;
   private String AV12pregunta ;
   private String AV13Flag ;
   private String AV15Station ;
   private String AV18EmprCod ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String GXv_char2[] ;
   private String AV17UsurCod ;
   private String GXv_char3[] ;
   private String A4352ArtPreUsrM ;
   private java.util.Date AV19ArtPreUlAc ;
   private java.util.Date A4351ArtPreUlAc ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean n4325RecIOB ;
   private boolean n4324RecIPor ;
   private boolean n4323RecIImp ;
   private boolean n675PorRec ;
   private boolean n596LimUni ;
   private boolean n4351ArtPreUlAc ;
   private boolean n4352ArtPreUsrM ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private byte[] aP4 ;
   private java.util.Date[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P01952_A396EmprCod ;
   private int[] P01952_A252CliCod ;
   private String[] P01952_A65ArtCod ;
   private byte[] P01952_A583IntCod ;
   private byte[] P01952_A831TipColCod ;
   private String[] P01952_A4325RecIOB ;
   private boolean[] P01952_n4325RecIOB ;
   private java.math.BigDecimal[] P01952_A4324RecIPor ;
   private boolean[] P01952_n4324RecIPor ;
   private java.math.BigDecimal[] P01952_A4323RecIImp ;
   private boolean[] P01952_n4323RecIImp ;
   private short[] P01952_A4322Limite5 ;
   private String[] P01953_A396EmprCod ;
   private int[] P01953_A252CliCod ;
   private String[] P01953_A65ArtCod ;
   private java.math.BigDecimal[] P01953_A675PorRec ;
   private boolean[] P01953_n675PorRec ;
   private int[] P01953_A596LimUni ;
   private boolean[] P01953_n596LimUni ;
   private byte[] P01953_A598LinRec ;
   private String[] P01954_A396EmprCod ;
   private int[] P01954_A252CliCod ;
   private String[] P01954_A65ArtCod ;
   private java.util.Date[] P01954_A4351ArtPreUlAc ;
   private boolean[] P01954_n4351ArtPreUlAc ;
   private String[] P01955_A396EmprCod ;
   private int[] P01955_A252CliCod ;
   private String[] P01955_A65ArtCod ;
   private java.util.Date[] P01955_A4351ArtPreUlAc ;
   private boolean[] P01955_n4351ArtPreUlAc ;
   private String[] P01955_A4352ArtPreUsrM ;
   private boolean[] P01955_n4352ArtPreUsrM ;
}

final  class pctlpmod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01952", "SELECT EmprCod, CliCod, ArtCod, IntCod, TipColCod, RecIOB, RecIPor, RecIImp, Limite5 FROM TXPRecInt WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01953", "SELECT EmprCod, CliCod, ArtCod, PorRec, LimUni, LinRec FROM TXPRECARG WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01954", "SELECT EmprCod, CliCod, ArtCod, ArtPreUlAc FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01955", "SELECT EmprCod, CliCod, ArtCod, ArtPreUlAc, ArtPreUsrM FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01956", "UPDATE TXPARTICU SET ArtPreUlAc=?, ArtPreUsrM=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               return;
      }
   }

}

