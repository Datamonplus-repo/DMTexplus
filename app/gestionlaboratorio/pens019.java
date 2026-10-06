package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens019 extends GXProcedure
{
   public pens019( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens019.class ), "" );
   }

   public pens019( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 ,
                             java.util.Date[] aP8 )
   {
      pens019.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 ,
                        java.util.Date[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 ,
                             java.util.Date[] aP8 ,
                             String[] aP9 )
   {
      pens019.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens019.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens019.this.AV10Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens019.this.AV13Lb_ArtCod = aP3[0];
      this.aP3 = aP3;
      pens019.this.AV12Lb_ColNom = aP4[0];
      this.aP4 = aP4;
      pens019.this.AV8Lb_colnum = aP5[0];
      this.aP5 = aP5;
      pens019.this.AV16TipColCod = aP6[0];
      this.aP6 = aP6;
      pens019.this.AV9Lb_tiprec = aP7[0];
      this.aP7 = aP7;
      pens019.this.AV11Fecha_ap = aP8[0];
      this.aP8 = aP8;
      pens019.this.AV15Opcion = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pens019.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      pens019.this.A396EmprCod = GXv_char2[0] ;
      pens019.this.AV19EmprNom = GXv_char3[0] ;
      pens019.this.AV20UsurCod = GXv_char4[0] ;
      /* Using cursor P01WN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5537Lb_ColNum = P01WN2_A5537Lb_ColNum[0] ;
         A5597Lb_TipRec = P01WN2_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = AV8Lb_colnum ;
         A5597Lb_TipRec = AV9Lb_tiprec ;
         if ( GXutil.strcmp(AV15Opcion, httpContext.getMessage( "C", "")) != 0 )
         {
            /* Using cursor P01WN3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV10Lb_opcion});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A5555Lb_opcion = P01WN3_A5555Lb_opcion[0] ;
               A5566Lb_Estado = P01WN3_A5566Lb_Estado[0] ;
               A5567Lb_FechaEn = P01WN3_A5567Lb_FechaEn[0] ;
               A5568Lb_HoraEn = P01WN3_A5568Lb_HoraEn[0] ;
               A5563Lb_FechaR = P01WN3_A5563Lb_FechaR[0] ;
               A5564Lb_HoraR = P01WN3_A5564Lb_HoraR[0] ;
               AV21Lb_HoraR = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
               AV22Lb_HoraEn = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
               AV17Inc_obs = httpContext.getMessage( "Aprobacion Interna Ensayos.", "") + GXutil.newLine( ) ;
               AV17Inc_obs += httpContext.getMessage( "Opcion           ", "") + A5555Lb_opcion + GXutil.newLine( ) ;
               AV17Inc_obs += httpContext.getMessage( "Estado actual    ", "") + GXutil.str( A5566Lb_Estado, 1, 0) + httpContext.getMessage( " Estado Nuevo     ", "") + "3" + GXutil.newLine( ) ;
               AV17Inc_obs += httpContext.getMessage( "Fec Env   actual ", "") + localUtil.dtoc( A5567Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Fecha Env Nueva  ", "") + localUtil.dtoc( AV11Fecha_ap, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
               AV17Inc_obs += httpContext.getMessage( "Hhmm Env actual  ", "") + localUtil.ttoc( A5568Lb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Hhmm Recep Nueva ", "") + localUtil.ttoc( AV22Lb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
               AV17Inc_obs += httpContext.getMessage( "Fec Recep actual  ", "") + localUtil.dtoc( A5563Lb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Fecha Recep Nueva ", "") + localUtil.dtoc( AV11Fecha_ap, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
               AV17Inc_obs += httpContext.getMessage( "Hhmm Recep actual ", "") + localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Hhmm Recep Nueva  ", "") + localUtil.ttoc( AV21Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV27Pgmname, AV20UsurCod, AV18Station, AV17Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
               A5563Lb_FechaR = AV11Fecha_ap ;
               A5564Lb_HoraR = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
               A5566Lb_Estado = (byte)(3) ;
               A5567Lb_FechaEn = AV11Fecha_ap ;
               A5568Lb_HoraEn = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
               /* Using cursor P01WN4 */
               pr_default.execute(2, new Object[] {Byte.valueOf(A5566Lb_Estado), A5567Lb_FechaEn, A5568Lb_HoraEn, A5563Lb_FechaR, A5564Lb_HoraR, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
         /* Using cursor P01WN5 */
         pr_default.execute(3, new Object[] {Integer.valueOf(A5537Lb_ColNum), Byte.valueOf(A5597Lb_TipRec), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens019.this.A396EmprCod;
      this.aP1[0] = pens019.this.A5532Lb_numero;
      this.aP2[0] = pens019.this.AV10Lb_opcion;
      this.aP3[0] = pens019.this.AV13Lb_ArtCod;
      this.aP4[0] = pens019.this.AV12Lb_ColNom;
      this.aP5[0] = pens019.this.AV8Lb_colnum;
      this.aP6[0] = pens019.this.AV16TipColCod;
      this.aP7[0] = pens019.this.AV9Lb_tiprec;
      this.aP8[0] = pens019.this.AV11Fecha_ap;
      this.aP9[0] = pens019.this.AV15Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens019");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV19EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV20UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P01WN2_A396EmprCod = new String[] {""} ;
      P01WN2_A5532Lb_numero = new int[1] ;
      P01WN2_A5537Lb_ColNum = new int[1] ;
      P01WN2_A5597Lb_TipRec = new byte[1] ;
      P01WN3_A396EmprCod = new String[] {""} ;
      P01WN3_A5532Lb_numero = new int[1] ;
      P01WN3_A5555Lb_opcion = new String[] {""} ;
      P01WN3_A5566Lb_Estado = new byte[1] ;
      P01WN3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P01WN3_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P01WN3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P01WN3_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      A5555Lb_opcion = "" ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV21Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV22Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      AV17Inc_obs = "" ;
      AV27Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens019__default(),
         new Object[] {
             new Object[] {
            P01WN2_A396EmprCod, P01WN2_A5532Lb_numero, P01WN2_A5537Lb_ColNum, P01WN2_A5597Lb_TipRec
            }
            , new Object[] {
            P01WN3_A396EmprCod, P01WN3_A5532Lb_numero, P01WN3_A5555Lb_opcion, P01WN3_A5566Lb_Estado, P01WN3_A5567Lb_FechaEn, P01WN3_A5568Lb_HoraEn, P01WN3_A5563Lb_FechaR, P01WN3_A5564Lb_HoraR
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV27Pgmname = "GestionLaboratorio.PENS019" ;
      /* GeneXus formulas. */
      AV27Pgmname = "GestionLaboratorio.PENS019" ;
      Gx_err = (short)(0) ;
   }

   private byte AV16TipColCod ;
   private byte AV9Lb_tiprec ;
   private byte A5597Lb_TipRec ;
   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int AV8Lb_colnum ;
   private int A5537Lb_ColNum ;
   private String A396EmprCod ;
   private String AV10Lb_opcion ;
   private String AV13Lb_ArtCod ;
   private String AV12Lb_ColNom ;
   private String AV15Opcion ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV19EmprNom ;
   private String GXv_char3[] ;
   private String AV20UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String AV27Pgmname ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date AV21Lb_HoraR ;
   private java.util.Date AV22Lb_HoraEn ;
   private java.util.Date AV11Fecha_ap ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private String AV17Inc_obs ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private byte[] aP7 ;
   private java.util.Date[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P01WN2_A396EmprCod ;
   private int[] P01WN2_A5532Lb_numero ;
   private int[] P01WN2_A5537Lb_ColNum ;
   private byte[] P01WN2_A5597Lb_TipRec ;
   private String[] P01WN3_A396EmprCod ;
   private int[] P01WN3_A5532Lb_numero ;
   private String[] P01WN3_A5555Lb_opcion ;
   private byte[] P01WN3_A5566Lb_Estado ;
   private java.util.Date[] P01WN3_A5567Lb_FechaEn ;
   private java.util.Date[] P01WN3_A5568Lb_HoraEn ;
   private java.util.Date[] P01WN3_A5563Lb_FechaR ;
   private java.util.Date[] P01WN3_A5564Lb_HoraR ;
}

final  class pens019__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01WN2", "SELECT EmprCod, Lb_numero, Lb_ColNum, Lb_TipRec FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01WN3", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_Estado, Lb_FechaEn, Lb_HoraEn, Lb_FechaR, Lb_HoraR FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WN4", "UPDATE TXPENS002 SET Lb_Estado=?, Lb_FechaEn=?, Lb_HoraEn=?, Lb_FechaR=?, Lb_HoraR=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new UpdateCursor("P01WN5", "UPDATE TXPENS001 SET Lb_ColNum=?, Lb_TipRec=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDateTime(3, (java.util.Date)parms[2], true);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDateTime(5, (java.util.Date)parms[4], true);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

