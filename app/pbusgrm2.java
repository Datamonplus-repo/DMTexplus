package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusgrm2 extends GXProcedure
{
   public pbusgrm2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusgrm2.class ), "" );
   }

   public pbusgrm2( int remoteHandle ,
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
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 )
   {
      pbusgrm2.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 )
   {
      pbusgrm2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusgrm2.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbusgrm2.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pbusgrm2.this.AV10MsgGrm1 = aP3[0];
      this.aP3 = aP3;
      pbusgrm2.this.AV11MsgGrm2 = aP4[0];
      this.aP4 = aP4;
      pbusgrm2.this.AV12Grm2 = aP5[0];
      this.aP5 = aP5;
      pbusgrm2.this.AV14Usurcod = aP6[0];
      this.aP6 = aP6;
      pbusgrm2.this.AV15Station = aP7[0];
      this.aP7 = aP7;
      pbusgrm2.this.AV16PgmnameIN = aP8[0];
      this.aP8 = aP8;
      pbusgrm2.this.AV17Barcod = aP9[0];
      this.aP9 = aP9;
      pbusgrm2.this.AV18Barcodreo = aP10[0];
      this.aP10 = aP10;
      pbusgrm2.this.AV19Barcodpar = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ArtGraAca = (short)(0) ;
      AV9ArtGraAca2 = (short)(0) ;
      AV13Inc_obs = " " ;
      /* Using cursor P05OH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1903ArtGraAca = P05OH2_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P05OH2_n1903ArtGraAca[0] ;
         A3125ArtGraAca2 = P05OH2_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = P05OH2_n3125ArtGraAca2[0] ;
         AV8ArtGraAca = A1903ArtGraAca ;
         AV9ArtGraAca2 = A3125ArtGraAca2 ;
         if ( ( AV9ArtGraAca2 > 0 ) && ( AV8ArtGraAca > 0 ) )
         {
            AV13Inc_obs = httpContext.getMessage( "Error. NO puedo evaluar el dato introducido ", "") + GXutil.str( AV12Grm2, 4, 2) + GXutil.newLine( ) ;
            AV13Inc_obs += httpContext.getMessage( "En la ficha del Articulo  ", "") + GXutil.str( A252CliCod, 6, 0) + " " + A65ArtCod + GXutil.newLine( ) ;
            AV13Inc_obs += httpContext.getMessage( " estan introducilos los dos valores en Grm2 Acabado ", "") + GXutil.str( AV8ArtGraAca, 4, 0) + httpContext.getMessage( " y ", "") + GXutil.str( AV9ArtGraAca2, 4, 0) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV10MsgGrm1 = " " ;
      AV11MsgGrm2 = " " ;
      if ( GXutil.strcmp(AV13Inc_obs, " ") != 0 )
      {
         AV17Barcod = ((AV17Barcod==0) ? 99999999 : AV17Barcod) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV23Pgmname, AV14Usurcod, AV15Station, AV13Inc_obs, AV17Barcod, AV18Barcodreo, AV19Barcodpar) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         if ( ( AV12Grm2.doubleValue() > AV8ArtGraAca ) && ( AV8ArtGraAca > 0 ) && ( AV12Grm2.doubleValue() > 0 ) )
         {
            AV10MsgGrm1 = httpContext.getMessage( "Erro.Este Artigo só permite ser", "") + GXutil.newLine( ) ;
            AV10MsgGrm1 += httpContext.getMessage( "utilizado com gramagens", "") + GXutil.newLine( ) ;
            AV10MsgGrm1 += httpContext.getMessage( "Acabadas inferior a ", "") + GXutil.str( AV8ArtGraAca, 4, 0) + httpContext.getMessage( " gm2", "") ;
         }
         if ( ( AV12Grm2.doubleValue() < AV9ArtGraAca2 ) && ( AV9ArtGraAca2 > 0 ) && ( AV12Grm2.doubleValue() > 0 ) )
         {
            AV11MsgGrm2 = httpContext.getMessage( "Erro.Este Artigo só permite ser", "") + GXutil.newLine( ) ;
            AV11MsgGrm2 += httpContext.getMessage( "utilizado com gramagens", "") + GXutil.newLine( ) ;
            AV11MsgGrm2 += httpContext.getMessage( "Acabadas superiores a ", "") + GXutil.str( AV9ArtGraAca2, 4, 0) + httpContext.getMessage( " gm2", "") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusgrm2.this.A396EmprCod;
      this.aP1[0] = pbusgrm2.this.A252CliCod;
      this.aP2[0] = pbusgrm2.this.A65ArtCod;
      this.aP3[0] = pbusgrm2.this.AV10MsgGrm1;
      this.aP4[0] = pbusgrm2.this.AV11MsgGrm2;
      this.aP5[0] = pbusgrm2.this.AV12Grm2;
      this.aP6[0] = pbusgrm2.this.AV14Usurcod;
      this.aP7[0] = pbusgrm2.this.AV15Station;
      this.aP8[0] = pbusgrm2.this.AV16PgmnameIN;
      this.aP9[0] = pbusgrm2.this.AV17Barcod;
      this.aP10[0] = pbusgrm2.this.AV18Barcodreo;
      this.aP11[0] = pbusgrm2.this.AV19Barcodpar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Inc_obs = "" ;
      scmdbuf = "" ;
      P05OH2_A396EmprCod = new String[] {""} ;
      P05OH2_A252CliCod = new int[1] ;
      P05OH2_A65ArtCod = new String[] {""} ;
      P05OH2_A1903ArtGraAca = new short[1] ;
      P05OH2_n1903ArtGraAca = new boolean[] {false} ;
      P05OH2_A3125ArtGraAca2 = new short[1] ;
      P05OH2_n3125ArtGraAca2 = new boolean[] {false} ;
      AV23Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusgrm2__default(),
         new Object[] {
             new Object[] {
            P05OH2_A396EmprCod, P05OH2_A252CliCod, P05OH2_A65ArtCod, P05OH2_A1903ArtGraAca, P05OH2_n1903ArtGraAca, P05OH2_A3125ArtGraAca2, P05OH2_n3125ArtGraAca2
            }
         }
      );
      AV23Pgmname = "Pbusgrm2" ;
      /* GeneXus formulas. */
      AV23Pgmname = "Pbusgrm2" ;
      Gx_err = (short)(0) ;
   }

   private byte AV18Barcodreo ;
   private short AV8ArtGraAca ;
   private short AV9ArtGraAca2 ;
   private short A1903ArtGraAca ;
   private short A3125ArtGraAca2 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV17Barcod ;
   private java.math.BigDecimal AV12Grm2 ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV10MsgGrm1 ;
   private String AV11MsgGrm2 ;
   private String AV14Usurcod ;
   private String AV15Station ;
   private String AV16PgmnameIN ;
   private String AV19Barcodpar ;
   private String scmdbuf ;
   private String AV23Pgmname ;
   private boolean n1903ArtGraAca ;
   private boolean n3125ArtGraAca2 ;
   private boolean returnInSub ;
   private String AV13Inc_obs ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private byte[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P05OH2_A396EmprCod ;
   private int[] P05OH2_A252CliCod ;
   private String[] P05OH2_A65ArtCod ;
   private short[] P05OH2_A1903ArtGraAca ;
   private boolean[] P05OH2_n1903ArtGraAca ;
   private short[] P05OH2_A3125ArtGraAca2 ;
   private boolean[] P05OH2_n3125ArtGraAca2 ;
}

final  class pbusgrm2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05OH2", "SELECT EmprCod, CliCod, ArtCod, ArtGraAca, ArtGraAca2 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
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
               return;
      }
   }

}

