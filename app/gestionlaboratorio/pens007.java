package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens007 extends GXProcedure
{
   public pens007( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens007.class ), "" );
   }

   public pens007( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        int aP6 ,
                        byte aP7 ,
                        byte aP8 ,
                        byte aP9 ,
                        String aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             int aP6 ,
                             byte aP7 ,
                             byte aP8 ,
                             byte aP9 ,
                             String aP10 )
   {
      pens007.this.AV22EmprCod = aP0;
      pens007.this.AV23lb_numero = aP1;
      pens007.this.AV13Lb_opcion = aP2;
      pens007.this.AV8Lb_fechar = aP3;
      pens007.this.AV9Lb_HoraR = aP4;
      pens007.this.AV15Lb_ColNom = aP5;
      pens007.this.AV11Lb_colNum = aP6;
      pens007.this.AV17TipColCod = aP7;
      pens007.this.AV12Lb_tiprec = aP8;
      pens007.this.AV10Lb_estado = aP9;
      pens007.this.AV14Lb_ProvDef = aP10;
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
      pens007.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = AV22EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      pens007.this.AV22EmprCod = GXv_char2[0] ;
      pens007.this.AV19EmprNom = GXv_char3[0] ;
      pens007.this.AV20UsurCod = GXv_char4[0] ;
      /* Using cursor P01TA2 */
      pr_default.execute(0, new Object[] {AV22EmprCod, Integer.valueOf(AV23lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P01TA2_A5532Lb_numero[0] ;
         A396EmprCod = P01TA2_A396EmprCod[0] ;
         A5537Lb_ColNum = P01TA2_A5537Lb_ColNum[0] ;
         A5597Lb_TipRec = P01TA2_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = AV11Lb_colNum ;
         A5597Lb_TipRec = AV12Lb_tiprec ;
         AV21Inc_obs = "" ;
         /* Using cursor P01TA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV13Lb_opcion});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5555Lb_opcion = P01TA3_A5555Lb_opcion[0] ;
            A6461Lb_FecNoa1 = P01TA3_A6461Lb_FecNoa1[0] ;
            A5566Lb_Estado = P01TA3_A5566Lb_Estado[0] ;
            A5563Lb_FechaR = P01TA3_A5563Lb_FechaR[0] ;
            A5564Lb_HoraR = P01TA3_A5564Lb_HoraR[0] ;
            A6631Lb_ProvDef = P01TA3_A6631Lb_ProvDef[0] ;
            if ( ( A5566Lb_Estado == 2 ) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
            {
            }
            else
            {
               if ( AV10Lb_estado == 2 )
               {
                  AV21Inc_obs = httpContext.getMessage( "Recepcion Ensayos.", "") + GXutil.newLine( ) ;
               }
               else
               {
                  AV21Inc_obs = httpContext.getMessage( "Recepcion Ensayos.Elimino", "") + GXutil.newLine( ) ;
               }
               AV21Inc_obs += httpContext.getMessage( "Estado actual ", "") + GXutil.str( A5566Lb_Estado, 1, 0) + httpContext.getMessage( " Estado Nuevo ", "") + GXutil.str( AV10Lb_estado, 1, 0) + GXutil.newLine( ) ;
               AV21Inc_obs += httpContext.getMessage( "Fec Recep actual ", "") + localUtil.dtoc( A5563Lb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Fecha Recep Nueva ", "") + localUtil.dtoc( AV8Lb_fechar, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
               AV21Inc_obs += httpContext.getMessage( "Hhmm Recep actual ", "") + localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Hhmm Recep Nueva ", "") + localUtil.ttoc( AV9Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
               AV21Inc_obs += httpContext.getMessage( "ProvDef actual ", "") + A6631Lb_ProvDef + httpContext.getMessage( " Provdef Recep Nueva ", "") + AV14Lb_ProvDef ;
               A5566Lb_Estado = AV10Lb_estado ;
               A5563Lb_FechaR = AV8Lb_fechar ;
               A5564Lb_HoraR = AV9Lb_HoraR ;
               A6631Lb_ProvDef = AV14Lb_ProvDef ;
            }
            /* Using cursor P01TA4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A5566Lb_Estado), A5563Lb_FechaR, A5564Lb_HoraR, A6631Lb_ProvDef, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P01TA5 */
         pr_default.execute(3, new Object[] {Integer.valueOf(A5537Lb_ColNum), Byte.valueOf(A5597Lb_TipRec), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV21Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV28Pgmname, AV20UsurCod, AV18Station, AV21Inc_obs, AV23lb_numero, (byte)(0), " ") ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens007");
      AV21Inc_obs = "" ;
      /* Using cursor P01TA6 */
      pr_default.execute(4, new Object[] {AV22EmprCod, Integer.valueOf(AV23lb_numero)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A5532Lb_numero = P01TA6_A5532Lb_numero[0] ;
         A396EmprCod = P01TA6_A396EmprCod[0] ;
         /* Using cursor P01TA7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV13Lb_opcion});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A5555Lb_opcion = P01TA7_A5555Lb_opcion[0] ;
            A6461Lb_FecNoa1 = P01TA7_A6461Lb_FecNoa1[0] ;
            A5567Lb_FechaEn = P01TA7_A5567Lb_FechaEn[0] ;
            A5566Lb_Estado = P01TA7_A5566Lb_Estado[0] ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
            {
               if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) )
               {
                  AV21Inc_obs = httpContext.getMessage( "Recepcion Ensayos.Cerramos resto Opciones", "") + GXutil.newLine( ) ;
                  AV21Inc_obs += httpContext.getMessage( "Opcion ", "") + A5555Lb_opcion + GXutil.newLine( ) ;
                  AV21Inc_obs += httpContext.getMessage( "Estado actual ", "") + GXutil.str( A5566Lb_Estado, 1, 0) + httpContext.getMessage( " Estado Nuevo ", "") + GXutil.str( AV10Lb_estado, 1, 0) ;
                  A5566Lb_Estado = AV10Lb_estado ;
               }
            }
            /* Using cursor P01TA8 */
            pr_default.execute(6, new Object[] {Byte.valueOf(A5566Lb_Estado), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( ! (GXutil.strcmp("", AV21Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV28Pgmname, AV20UsurCod, AV18Station, AV21Inc_obs, AV23lb_numero, (byte)(0), " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens007");
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
      P01TA2_A5532Lb_numero = new int[1] ;
      P01TA2_A396EmprCod = new String[] {""} ;
      P01TA2_A5537Lb_ColNum = new int[1] ;
      P01TA2_A5597Lb_TipRec = new byte[1] ;
      A396EmprCod = "" ;
      AV21Inc_obs = "" ;
      P01TA3_A396EmprCod = new String[] {""} ;
      P01TA3_A5532Lb_numero = new int[1] ;
      P01TA3_A5555Lb_opcion = new String[] {""} ;
      P01TA3_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01TA3_A5566Lb_Estado = new byte[1] ;
      P01TA3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P01TA3_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      P01TA3_A6631Lb_ProvDef = new String[] {""} ;
      A5555Lb_opcion = "" ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      A6631Lb_ProvDef = "" ;
      AV28Pgmname = "" ;
      P01TA6_A5532Lb_numero = new int[1] ;
      P01TA6_A396EmprCod = new String[] {""} ;
      P01TA7_A396EmprCod = new String[] {""} ;
      P01TA7_A5532Lb_numero = new int[1] ;
      P01TA7_A5555Lb_opcion = new String[] {""} ;
      P01TA7_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01TA7_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P01TA7_A5566Lb_Estado = new byte[1] ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens007__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens007__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens007__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens007__default(),
         new Object[] {
             new Object[] {
            P01TA2_A5532Lb_numero, P01TA2_A396EmprCod, P01TA2_A5537Lb_ColNum, P01TA2_A5597Lb_TipRec
            }
            , new Object[] {
            P01TA3_A396EmprCod, P01TA3_A5532Lb_numero, P01TA3_A5555Lb_opcion, P01TA3_A6461Lb_FecNoa1, P01TA3_A5566Lb_Estado, P01TA3_A5563Lb_FechaR, P01TA3_A5564Lb_HoraR, P01TA3_A6631Lb_ProvDef
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01TA6_A5532Lb_numero, P01TA6_A396EmprCod
            }
            , new Object[] {
            P01TA7_A396EmprCod, P01TA7_A5532Lb_numero, P01TA7_A5555Lb_opcion, P01TA7_A6461Lb_FecNoa1, P01TA7_A5567Lb_FechaEn, P01TA7_A5566Lb_Estado
            }
            , new Object[] {
            }
         }
      );
      AV28Pgmname = "GestionLaboratorio.PENS007" ;
      /* GeneXus formulas. */
      AV28Pgmname = "GestionLaboratorio.PENS007" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17TipColCod ;
   private byte AV12Lb_tiprec ;
   private byte AV10Lb_estado ;
   private byte A5597Lb_TipRec ;
   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int AV23lb_numero ;
   private int AV11Lb_colNum ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private String AV22EmprCod ;
   private String AV13Lb_opcion ;
   private String AV15Lb_ColNom ;
   private String AV14Lb_ProvDef ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV19EmprNom ;
   private String GXv_char3[] ;
   private String AV20UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String A6631Lb_ProvDef ;
   private String AV28Pgmname ;
   private java.util.Date AV9Lb_HoraR ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date AV8Lb_fechar ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A5567Lb_FechaEn ;
   private String AV21Inc_obs ;
   private IDataStoreProvider pr_default ;
   private int[] P01TA2_A5532Lb_numero ;
   private String[] P01TA2_A396EmprCod ;
   private int[] P01TA2_A5537Lb_ColNum ;
   private byte[] P01TA2_A5597Lb_TipRec ;
   private String[] P01TA3_A396EmprCod ;
   private int[] P01TA3_A5532Lb_numero ;
   private String[] P01TA3_A5555Lb_opcion ;
   private java.util.Date[] P01TA3_A6461Lb_FecNoa1 ;
   private byte[] P01TA3_A5566Lb_Estado ;
   private java.util.Date[] P01TA3_A5563Lb_FechaR ;
   private java.util.Date[] P01TA3_A5564Lb_HoraR ;
   private String[] P01TA3_A6631Lb_ProvDef ;
   private int[] P01TA6_A5532Lb_numero ;
   private String[] P01TA6_A396EmprCod ;
   private String[] P01TA7_A396EmprCod ;
   private int[] P01TA7_A5532Lb_numero ;
   private String[] P01TA7_A5555Lb_opcion ;
   private java.util.Date[] P01TA7_A6461Lb_FecNoa1 ;
   private java.util.Date[] P01TA7_A5567Lb_FechaEn ;
   private byte[] P01TA7_A5566Lb_Estado ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pens007__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pens007__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pens007__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pens007__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01TA2", "SELECT Lb_numero, EmprCod, Lb_ColNum, Lb_TipRec FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01TA3", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_FecNoa1, Lb_Estado, Lb_FechaR, Lb_HoraR, Lb_ProvDef FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01TA4", "UPDATE TXPENS002 SET Lb_Estado=?, Lb_FechaR=?, Lb_HoraR=?, Lb_ProvDef=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new UpdateCursor("P01TA5", "UPDATE TXPENS001 SET Lb_ColNum=?, Lb_TipRec=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
         ,new ForEachCursor("P01TA6", "SELECT Lb_numero, EmprCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01TA7", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_FecNoa1, Lb_FechaEn, Lb_Estado FROM TXPENS002 WHERE (EmprCod = ? and Lb_numero = ?) AND (Lb_opcion <> ?) ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01TA8", "UPDATE TXPENS002 SET Lb_Estado=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
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
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

