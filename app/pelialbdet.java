package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelialbdet extends GXProcedure
{
   public pelialbdet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelialbdet.class ), "" );
   }

   public pelialbdet( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      pelialbdet.this.A396EmprCod = aP0;
      pelialbdet.this.AV11AlbRecCod = aP1;
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
      pelialbdet.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      pelialbdet.this.A396EmprCod = GXv_char2[0] ;
      pelialbdet.this.AV16EmprNom = GXv_char3[0] ;
      pelialbdet.this.AV17UsurCod = GXv_char4[0] ;
      AV12PieUti = httpContext.getMessage( "N/U", "") ;
      /* Using cursor P02SN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P02SN2_A44AlbRecCod[0] ;
         A2159AlbRecPie = P02SN2_A2159AlbRecPie[0] ;
         GXt_char1 = AV12PieUti ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         GXv_char2[0] = GXt_char1 ;
         new app.palrpieuti(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2) ;
         pelialbdet.this.A396EmprCod = GXv_char4[0] ;
         pelialbdet.this.A44AlbRecCod = GXv_int5[0] ;
         pelialbdet.this.A2159AlbRecPie = GXv_char3[0] ;
         pelialbdet.this.GXt_char1 = GXv_char2[0] ;
         AV12PieUti = GXt_char1 ;
         if ( GXutil.strcmp(AV12PieUti, httpContext.getMessage( "N/U", "")) != 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV12PieUti, httpContext.getMessage( "N/U", "")) != 0 )
      {
         AV14Msg_err = httpContext.getMessage( "Atencion. Este N recepcion ", "") + GXutil.str( AV11AlbRecCod, 8, 0) + GXutil.newLine( ) ;
         AV14Msg_err += httpContext.getMessage( "Esta en Produccion ", "") + GXutil.newLine( ) ;
         AV14Msg_err += AV12PieUti + GXutil.newLine( ) ;
         AV14Msg_err += httpContext.getMessage( "NO es posible su Eliminacion ¡¡¡", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(AV14Msg_err);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P02SN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11AlbRecCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A44AlbRecCod = P02SN3_A44AlbRecCod[0] ;
         A3613AlbRefDsc = P02SN3_A3613AlbRefDsc[0] ;
         A45AlbRef = P02SN3_A45AlbRef[0] ;
         A279CliNom = P02SN3_A279CliNom[0] ;
         A252CliCod = P02SN3_A252CliCod[0] ;
         A279CliNom = P02SN3_A279CliNom[0] ;
         /* Using cursor P02SN4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2159AlbRecPie = P02SN4_A2159AlbRecPie[0] ;
            /* Optimized DELETE. */
            /* Using cursor P02SN5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBRDF");
            /* End optimized DELETE. */
            /* Using cursor P02SN6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Optimized DELETE. */
         /* Using cursor P02SN7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
         /* End optimized DELETE. */
         /* Using cursor P02SN8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         AV15Inc_obs = httpContext.getMessage( "TALBDET-Eliminacion TOTAL, AlbReccod=", "") + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) + httpContext.getMessage( " Cliente=", "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( " Articulo=", "") + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A3613AlbRefDsc) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV26Pgmname, AV17UsurCod, AV18Station, AV15Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pelialbdet");
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
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      AV12PieUti = "" ;
      scmdbuf = "" ;
      P02SN2_A396EmprCod = new String[] {""} ;
      P02SN2_A44AlbRecCod = new int[1] ;
      P02SN2_A2159AlbRecPie = new String[] {""} ;
      A2159AlbRecPie = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV14Msg_err = "" ;
      P02SN3_A396EmprCod = new String[] {""} ;
      P02SN3_A44AlbRecCod = new int[1] ;
      P02SN3_A3613AlbRefDsc = new String[] {""} ;
      P02SN3_A45AlbRef = new String[] {""} ;
      P02SN3_A279CliNom = new String[] {""} ;
      P02SN3_A252CliCod = new int[1] ;
      A3613AlbRefDsc = "" ;
      A45AlbRef = "" ;
      A279CliNom = "" ;
      P02SN4_A396EmprCod = new String[] {""} ;
      P02SN4_A44AlbRecCod = new int[1] ;
      P02SN4_A2159AlbRecPie = new String[] {""} ;
      AV15Inc_obs = "" ;
      AV26Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelialbdet__default(),
         new Object[] {
             new Object[] {
            P02SN2_A396EmprCod, P02SN2_A44AlbRecCod, P02SN2_A2159AlbRecPie
            }
            , new Object[] {
            P02SN3_A396EmprCod, P02SN3_A44AlbRecCod, P02SN3_A3613AlbRefDsc, P02SN3_A45AlbRef, P02SN3_A279CliNom, P02SN3_A252CliCod
            }
            , new Object[] {
            P02SN4_A396EmprCod, P02SN4_A44AlbRecCod, P02SN4_A2159AlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV26Pgmname = "PEliAlbDet" ;
      /* GeneXus formulas. */
      AV26Pgmname = "PEliAlbDet" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV11AlbRecCod ;
   private int A44AlbRecCod ;
   private int GXv_int5[] ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String AV12PieUti ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV14Msg_err ;
   private String A3613AlbRefDsc ;
   private String A45AlbRef ;
   private String A279CliNom ;
   private String AV26Pgmname ;
   private boolean returnInSub ;
   private String AV15Inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P02SN2_A396EmprCod ;
   private int[] P02SN2_A44AlbRecCod ;
   private String[] P02SN2_A2159AlbRecPie ;
   private String[] P02SN3_A396EmprCod ;
   private int[] P02SN3_A44AlbRecCod ;
   private String[] P02SN3_A3613AlbRefDsc ;
   private String[] P02SN3_A45AlbRef ;
   private String[] P02SN3_A279CliNom ;
   private int[] P02SN3_A252CliCod ;
   private String[] P02SN4_A396EmprCod ;
   private int[] P02SN4_A44AlbRecCod ;
   private String[] P02SN4_A2159AlbRecPie ;
}

final  class pelialbdet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02SN2", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02SN3", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRefDsc, T1.AlbRef, T2.CliNom, T1.CliCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02SN4", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02SN5", "DELETE FROM TXPALBRDF  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBRDF")
         ,new UpdateCursor("P02SN6", "DELETE FROM TXPALBDET  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new UpdateCursor("P02SN7", "DELETE FROM TXPALBROB  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBROB")
         ,new UpdateCursor("P02SN8", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

