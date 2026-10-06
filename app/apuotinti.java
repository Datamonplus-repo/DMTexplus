package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apuotinti extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apuotinti pgm = new apuotinti (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apuotinti( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apuotinti.class ), "" );
   }

   public apuotinti( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Usurcod = " " ;
      AV21Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV22EmprNom ;
      GXv_char3[0] = AV20Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char1, GXv_char2, GXv_char3) ;
      apuotinti.this.A396EmprCod = GXv_char1[0] ;
      apuotinti.this.AV22EmprNom = GXv_char2[0] ;
      apuotinti.this.AV20Usurcod = GXv_char3[0] ;
      AV17Emprcod = A396EmprCod ;
      GXt_int4 = (byte)(AV23Clicod_g) ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV17Emprcod, httpContext.getMessage( "CLIGRL", ""), GXv_int5) ;
      apuotinti.this.GXt_int4 = GXv_int5[0] ;
      AV23Clicod_g = GXt_int4 ;
      if ( AV23Clicod_g == 0 )
      {
         AV23Clicod_g = 1 ;
      }
      AV16Num_r = 0 ;
      /* Using cursor P035A2 */
      pr_default.execute(0, new Object[] {AV17Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7843Int_Num = P035A2_A7843Int_Num[0] ;
         A396EmprCod = P035A2_A396EmprCod[0] ;
         A252CliCod = P035A2_A252CliCod[0] ;
         n252CliCod = P035A2_n252CliCod[0] ;
         A7844Int_Artcod = P035A2_A7844Int_Artcod[0] ;
         n7844Int_Artcod = P035A2_n7844Int_Artcod[0] ;
         A8324Int_Inc = P035A2_A8324Int_Inc[0] ;
         n8324Int_Inc = P035A2_n8324Int_Inc[0] ;
         AV17Emprcod = A396EmprCod ;
         AV18Clicod = A252CliCod ;
         AV19Artcod = A7844Int_Artcod ;
         /* Execute user subroutine: 'ARTICU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV24Articu == 0 ) && ( AV25Articu_g == 0 ) )
         {
            A8324Int_Inc = httpContext.getMessage( "S", "") ;
            n8324Int_Inc = false ;
            AV16Num_r = (int)(AV16Num_r+1) ;
            Gx_msg = httpContext.getMessage( "Procesando...", "") + GXutil.str( AV16Num_r, 6, 0) ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P035A3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n8324Int_Inc), A8324Int_Inc, A396EmprCod, Integer.valueOf(A7843Int_Num)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTINT");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV24Articu = (byte)(0) ;
      /* Optimized group. */
      /* Using cursor P035A4 */
      pr_default.execute(2, new Object[] {AV17Emprcod, Integer.valueOf(AV18Clicod), AV19Artcod});
      cV24Articu = P035A4_AV24Articu[0] ;
      pr_default.close(2);
      AV24Articu = (byte)(AV24Articu+cV24Articu*1) ;
      /* End optimized group. */
      AV25Articu_g = (byte)(0) ;
      /* Optimized group. */
      /* Using cursor P035A5 */
      pr_default.execute(3, new Object[] {AV17Emprcod, Integer.valueOf(AV23Clicod_g), AV19Artcod});
      cV25Articu_g = P035A5_AV25Articu_g[0] ;
      pr_default.close(3);
      AV25Articu_g = (byte)(AV25Articu_g+cV25Articu_g*1) ;
      /* End optimized group. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puotinti.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apuotinti");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Usurcod = "" ;
      AV21Station = "" ;
      A396EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV22EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV17Emprcod = "" ;
      GXv_int5 = new byte[1] ;
      scmdbuf = "" ;
      P035A2_A7843Int_Num = new int[1] ;
      P035A2_A396EmprCod = new String[] {""} ;
      P035A2_A252CliCod = new int[1] ;
      P035A2_n252CliCod = new boolean[] {false} ;
      P035A2_A7844Int_Artcod = new String[] {""} ;
      P035A2_n7844Int_Artcod = new boolean[] {false} ;
      P035A2_A8324Int_Inc = new String[] {""} ;
      P035A2_n8324Int_Inc = new boolean[] {false} ;
      A7844Int_Artcod = "" ;
      A8324Int_Inc = "" ;
      AV19Artcod = "" ;
      Gx_msg = "" ;
      P035A4_AV24Articu = new byte[1] ;
      P035A5_AV25Articu_g = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apuotinti__default(),
         new Object[] {
             new Object[] {
            P035A2_A7843Int_Num, P035A2_A396EmprCod, P035A2_A252CliCod, P035A2_n252CliCod, P035A2_A7844Int_Artcod, P035A2_n7844Int_Artcod, P035A2_A8324Int_Inc, P035A2_n8324Int_Inc
            }
            , new Object[] {
            }
            , new Object[] {
            P035A4_AV24Articu
            }
            , new Object[] {
            P035A5_AV25Articu_g
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private byte AV24Articu ;
   private byte AV25Articu_g ;
   private byte cV24Articu ;
   private byte cV25Articu_g ;
   private short Gx_err ;
   private int AV23Clicod_g ;
   private int AV16Num_r ;
   private int A7843Int_Num ;
   private int A252CliCod ;
   private int AV18Clicod ;
   private String AV20Usurcod ;
   private String AV21Station ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String AV22EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV17Emprcod ;
   private String scmdbuf ;
   private String A7844Int_Artcod ;
   private String A8324Int_Inc ;
   private String AV19Artcod ;
   private String Gx_msg ;
   private boolean n252CliCod ;
   private boolean n7844Int_Artcod ;
   private boolean n8324Int_Inc ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private int[] P035A2_A7843Int_Num ;
   private String[] P035A2_A396EmprCod ;
   private int[] P035A2_A252CliCod ;
   private boolean[] P035A2_n252CliCod ;
   private String[] P035A2_A7844Int_Artcod ;
   private boolean[] P035A2_n7844Int_Artcod ;
   private String[] P035A2_A8324Int_Inc ;
   private boolean[] P035A2_n8324Int_Inc ;
   private byte[] P035A4_AV24Articu ;
   private byte[] P035A5_AV25Articu_g ;
}

final  class apuotinti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P035A2", "SELECT Int_Num, EmprCod, CliCod, Int_Artcod, Int_Inc FROM TXPOTINT WHERE EmprCod = ? and Int_Num > 0 ORDER BY EmprCod, Int_Num ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P035A3", "UPDATE TXPOTINT SET Int_Inc=?  WHERE EmprCod = ? AND Int_Num = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOTINT")
         ,new ForEachCursor("P035A4", "SELECT COUNT(*) FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P035A5", "SELECT COUNT(*) FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
      }
   }

}

