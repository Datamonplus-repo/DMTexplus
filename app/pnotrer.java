package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnotrer extends GXProcedure
{
   public pnotrer( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnotrer.class ), "" );
   }

   public pnotrer( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             byte[] aP10 )
   {
      pnotrer.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 )
   {
      pnotrer.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnotrer.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pnotrer.this.AV13CliCod = aP2[0];
      this.aP2 = aP2;
      pnotrer.this.AV12CliNom = aP3[0];
      this.aP3 = aP3;
      pnotrer.this.AV14Nr_albent = aP4[0];
      this.aP4 = aP4;
      pnotrer.this.AV15Nr_artcod = aP5[0];
      this.aP5 = aP5;
      pnotrer.this.AV16Nr_artdsc = aP6[0];
      this.aP6 = aP6;
      pnotrer.this.AV17Nr_piezas = aP7[0];
      this.aP7 = aP7;
      pnotrer.this.AV19Nr_UniEnt = aP8[0];
      this.aP8 = aP8;
      pnotrer.this.AV18Nr_unidad = aP9[0];
      this.aP9 = aP9;
      pnotrer.this.AV10Ctrl_r = aP10[0];
      this.aP10 = aP10;
      pnotrer.this.Gx_msg = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Ctrl_r = (byte)(0) ;
      Gx_msg = GXutil.space( (short)(70)) ;
      /* Using cursor P01LV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P01LV2_A252CliCod[0] ;
         A279CliNom = P01LV2_A279CliNom[0] ;
         A46AlbREnt = P01LV2_A46AlbREnt[0] ;
         A5806AlbREnt2 = P01LV2_A5806AlbREnt2[0] ;
         A45AlbRef = P01LV2_A45AlbRef[0] ;
         A3613AlbRefDsc = P01LV2_A3613AlbRefDsc[0] ;
         A52AlbRPieEnt = P01LV2_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P01LV2_A58AlbRUniEnt[0] ;
         A56AlbRUni = P01LV2_A56AlbRUni[0] ;
         A55AlbRReo = P01LV2_A55AlbRReo[0] ;
         A279CliNom = P01LV2_A279CliNom[0] ;
         AV13CliCod = A252CliCod ;
         AV12CliNom = A279CliNom ;
         AV14Nr_albent = A46AlbREnt ;
         if ( GXutil.strcmp(A5806AlbREnt2, " ") != 0 )
         {
            AV14Nr_albent = GXutil.trim( GXutil.substring( A5806AlbREnt2, 1, 8)) ;
         }
         AV15Nr_artcod = A45AlbRef ;
         AV16Nr_artdsc = A3613AlbRefDsc ;
         AV17Nr_piezas = A52AlbRPieEnt ;
         AV19Nr_UniEnt = A58AlbRUniEnt ;
         AV18Nr_unidad = A56AlbRUni ;
         AV10Ctrl_r = (byte)(0) ;
         if ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 )
         {
            AV10Ctrl_r = (byte)(1) ;
         }
         AV11AlbRecCod = A44AlbRecCod ;
         /* Execute user subroutine: 'NOTREC' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'NOTREC' Routine */
      returnInSub = false ;
      /* Using cursor P01LV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5206Nr_albrecc = P01LV3_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P01LV3_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P01LV3_A5198Nr_codigo[0] ;
         Gx_msg = httpContext.getMessage( "Atencion¡¡¡, este Nº Recepcion = ", "") + GXutil.str( AV11AlbRecCod, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "ya existe en el Nº Reclamacion = ", "") + GXutil.str( A5198Nr_codigo, 8, 0) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnotrer.this.A396EmprCod;
      this.aP1[0] = pnotrer.this.A44AlbRecCod;
      this.aP2[0] = pnotrer.this.AV13CliCod;
      this.aP3[0] = pnotrer.this.AV12CliNom;
      this.aP4[0] = pnotrer.this.AV14Nr_albent;
      this.aP5[0] = pnotrer.this.AV15Nr_artcod;
      this.aP6[0] = pnotrer.this.AV16Nr_artdsc;
      this.aP7[0] = pnotrer.this.AV17Nr_piezas;
      this.aP8[0] = pnotrer.this.AV19Nr_UniEnt;
      this.aP9[0] = pnotrer.this.AV18Nr_unidad;
      this.aP10[0] = pnotrer.this.AV10Ctrl_r;
      this.aP11[0] = pnotrer.this.Gx_msg;
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
      P01LV2_A396EmprCod = new String[] {""} ;
      P01LV2_A44AlbRecCod = new int[1] ;
      P01LV2_A252CliCod = new int[1] ;
      P01LV2_A279CliNom = new String[] {""} ;
      P01LV2_A46AlbREnt = new String[] {""} ;
      P01LV2_A5806AlbREnt2 = new String[] {""} ;
      P01LV2_A45AlbRef = new String[] {""} ;
      P01LV2_A3613AlbRefDsc = new String[] {""} ;
      P01LV2_A52AlbRPieEnt = new int[1] ;
      P01LV2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LV2_A56AlbRUni = new String[] {""} ;
      P01LV2_A55AlbRReo = new String[] {""} ;
      A279CliNom = "" ;
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      P01LV3_A396EmprCod = new String[] {""} ;
      P01LV3_A5206Nr_albrecc = new int[1] ;
      P01LV3_n5206Nr_albrecc = new boolean[] {false} ;
      P01LV3_A5198Nr_codigo = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnotrer__default(),
         new Object[] {
             new Object[] {
            P01LV2_A396EmprCod, P01LV2_A44AlbRecCod, P01LV2_A252CliCod, P01LV2_A279CliNom, P01LV2_A46AlbREnt, P01LV2_A5806AlbREnt2, P01LV2_A45AlbRef, P01LV2_A3613AlbRefDsc, P01LV2_A52AlbRPieEnt, P01LV2_A58AlbRUniEnt,
            P01LV2_A56AlbRUni, P01LV2_A55AlbRReo
            }
            , new Object[] {
            P01LV3_A396EmprCod, P01LV3_A5206Nr_albrecc, P01LV3_n5206Nr_albrecc, P01LV3_A5198Nr_codigo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Ctrl_r ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV13CliCod ;
   private int AV17Nr_piezas ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int AV11AlbRecCod ;
   private int A5206Nr_albrecc ;
   private int A5198Nr_codigo ;
   private java.math.BigDecimal AV19Nr_UniEnt ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String A396EmprCod ;
   private String AV12CliNom ;
   private String AV14Nr_albent ;
   private String AV15Nr_artcod ;
   private String AV16Nr_artdsc ;
   private String AV18Nr_unidad ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A46AlbREnt ;
   private String A5806AlbREnt2 ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private boolean returnInSub ;
   private boolean n5206Nr_albrecc ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP9 ;
   private byte[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P01LV2_A396EmprCod ;
   private int[] P01LV2_A44AlbRecCod ;
   private int[] P01LV2_A252CliCod ;
   private String[] P01LV2_A279CliNom ;
   private String[] P01LV2_A46AlbREnt ;
   private String[] P01LV2_A5806AlbREnt2 ;
   private String[] P01LV2_A45AlbRef ;
   private String[] P01LV2_A3613AlbRefDsc ;
   private int[] P01LV2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P01LV2_A58AlbRUniEnt ;
   private String[] P01LV2_A56AlbRUni ;
   private String[] P01LV2_A55AlbRReo ;
   private String[] P01LV3_A396EmprCod ;
   private int[] P01LV3_A5206Nr_albrecc ;
   private boolean[] P01LV3_n5206Nr_albrecc ;
   private int[] P01LV3_A5198Nr_codigo ;
}

final  class pnotrer__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01LV2", "SELECT T1.EmprCod, T1.AlbRecCod, T1.CliCod, T2.CliNom, T1.AlbREnt, T1.AlbREnt2, T1.AlbRef, T1.AlbRefDsc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRUni, T1.AlbRReo FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01LV3", "SELECT EmprCod, Nr_albrecc, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
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
      }
   }

}

