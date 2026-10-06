package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class appre002 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      appre002 pgm = new appre002 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public appre002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( appre002.class ), "" );
   }

   public appre002( int remoteHandle ,
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
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV10Emprcod = "001" ;
      /* Using cursor P045V2 */
      pr_default.execute(0, new Object[] {AV10Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10579Pg_ColNom = P045V2_A10579Pg_ColNom[0] ;
         A10577Pg_Procod = P045V2_A10577Pg_Procod[0] ;
         A10582Pg_Pk = P045V2_A10582Pg_Pk[0] ;
         n10582Pg_Pk = P045V2_n10582Pg_Pk[0] ;
         A10583Pg_Pm = P045V2_A10583Pg_Pm[0] ;
         n10583Pg_Pm = P045V2_n10583Pg_Pm[0] ;
         A252CliCod = P045V2_A252CliCod[0] ;
         A396EmprCod = P045V2_A396EmprCod[0] ;
         A10581Pg_Tc = P045V2_A10581Pg_Tc[0] ;
         A10580Pg_ColNum = P045V2_A10580Pg_ColNum[0] ;
         A65ArtCod = P045V2_A65ArtCod[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPPRE001

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         A10839Txt_Cor = A10579Pg_ColNom ;
         A758ProCod = A10577Pg_Procod ;
         A10842Txt_ProPk = A10582Pg_Pk ;
         n10842Txt_ProPk = false ;
         A10843Txt_ProPm = A10583Pg_Pm ;
         n10843Txt_ProPm = false ;
         /* Using cursor P045V3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10839Txt_Cor, A758ProCod, Boolean.valueOf(n10842Txt_ProPk), A10842Txt_ProPk, Boolean.valueOf(n10843Txt_ProPm), A10843Txt_ProPm});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRE001");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         /* End Insert */
         Gx_msg = httpContext.getMessage( "Procesando...PRE002 ", "") + GXutil.str( A252CliCod, 6, 0) ;
         System.out.println( Gx_msg );
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P045V4 */
      pr_default.execute(2, new Object[] {AV10Emprcod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5536Lb_ColNom = P045V4_A5536Lb_ColNom[0] ;
         A5989Lb_PreKg = P045V4_A5989Lb_PreKg[0] ;
         A10083Lb_PreMt = P045V4_A10083Lb_PreMt[0] ;
         A252CliCod = P045V4_A252CliCod[0] ;
         A396EmprCod = P045V4_A396EmprCod[0] ;
         A5555Lb_opcion = P045V4_A5555Lb_opcion[0] ;
         A5532Lb_numero = P045V4_A5532Lb_numero[0] ;
         A5536Lb_ColNom = P045V4_A5536Lb_ColNom[0] ;
         A252CliCod = P045V4_A252CliCod[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPPRE002

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         A10839Txt_Cor = A5536Lb_ColNom ;
         A10840Txt_CorPk = A5989Lb_PreKg ;
         n10840Txt_CorPk = false ;
         A10841Txt_CorPm = A10083Lb_PreMt ;
         n10841Txt_CorPm = false ;
         /* Using cursor P045V5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A10839Txt_Cor, Boolean.valueOf(n10840Txt_CorPk), A10840Txt_CorPk, Boolean.valueOf(n10841Txt_CorPm), A10841Txt_CorPm});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRE002");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         /* End Insert */
         Gx_msg = httpContext.getMessage( "Procesando...PRE001 ", "") + GXutil.str( A5532Lb_numero, 8, 0) ;
         System.out.println( Gx_msg );
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ppre002.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "appre002");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Emprcod = "" ;
      scmdbuf = "" ;
      P045V2_A10579Pg_ColNom = new String[] {""} ;
      P045V2_A10577Pg_Procod = new String[] {""} ;
      P045V2_A10582Pg_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P045V2_n10582Pg_Pk = new boolean[] {false} ;
      P045V2_A10583Pg_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P045V2_n10583Pg_Pm = new boolean[] {false} ;
      P045V2_A252CliCod = new int[1] ;
      P045V2_A396EmprCod = new String[] {""} ;
      P045V2_A10581Pg_Tc = new short[1] ;
      P045V2_A10580Pg_ColNum = new int[1] ;
      P045V2_A65ArtCod = new String[] {""} ;
      A10579Pg_ColNom = "" ;
      A10577Pg_Procod = "" ;
      A10582Pg_Pk = DecimalUtil.ZERO ;
      A10583Pg_Pm = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      W396EmprCod = "" ;
      A10839Txt_Cor = "" ;
      A758ProCod = "" ;
      A10842Txt_ProPk = DecimalUtil.ZERO ;
      A10843Txt_ProPm = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      Gx_msg = "" ;
      P045V4_A5536Lb_ColNom = new String[] {""} ;
      P045V4_A5989Lb_PreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P045V4_A10083Lb_PreMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P045V4_A252CliCod = new int[1] ;
      P045V4_A396EmprCod = new String[] {""} ;
      P045V4_A5555Lb_opcion = new String[] {""} ;
      P045V4_A5532Lb_numero = new int[1] ;
      A5536Lb_ColNom = "" ;
      A5989Lb_PreKg = DecimalUtil.ZERO ;
      A10083Lb_PreMt = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      A10840Txt_CorPk = DecimalUtil.ZERO ;
      A10841Txt_CorPm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.appre002__default(),
         new Object[] {
             new Object[] {
            P045V2_A10579Pg_ColNom, P045V2_A10577Pg_Procod, P045V2_A10582Pg_Pk, P045V2_n10582Pg_Pk, P045V2_A10583Pg_Pm, P045V2_n10583Pg_Pm, P045V2_A252CliCod, P045V2_A396EmprCod, P045V2_A10581Pg_Tc, P045V2_A10580Pg_ColNum,
            P045V2_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P045V4_A5536Lb_ColNom, P045V4_A5989Lb_PreKg, P045V4_A10083Lb_PreMt, P045V4_A252CliCod, P045V4_A396EmprCod, P045V4_A5555Lb_opcion, P045V4_A5532Lb_numero
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A10581Pg_Tc ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A10580Pg_ColNum ;
   private int GX_INS1448 ;
   private int W252CliCod ;
   private int A5532Lb_numero ;
   private int GX_INS1447 ;
   private java.math.BigDecimal A10582Pg_Pk ;
   private java.math.BigDecimal A10583Pg_Pm ;
   private java.math.BigDecimal A10842Txt_ProPk ;
   private java.math.BigDecimal A10843Txt_ProPm ;
   private java.math.BigDecimal A5989Lb_PreKg ;
   private java.math.BigDecimal A10083Lb_PreMt ;
   private java.math.BigDecimal A10840Txt_CorPk ;
   private java.math.BigDecimal A10841Txt_CorPm ;
   private String AV10Emprcod ;
   private String scmdbuf ;
   private String A10579Pg_ColNom ;
   private String A10577Pg_Procod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String W396EmprCod ;
   private String A10839Txt_Cor ;
   private String A758ProCod ;
   private String Gx_emsg ;
   private String Gx_msg ;
   private String A5536Lb_ColNom ;
   private String A5555Lb_opcion ;
   private boolean n10582Pg_Pk ;
   private boolean n10583Pg_Pm ;
   private boolean n10842Txt_ProPk ;
   private boolean n10843Txt_ProPm ;
   private boolean n10840Txt_CorPk ;
   private boolean n10841Txt_CorPm ;
   private IDataStoreProvider pr_default ;
   private String[] P045V2_A10579Pg_ColNom ;
   private String[] P045V2_A10577Pg_Procod ;
   private java.math.BigDecimal[] P045V2_A10582Pg_Pk ;
   private boolean[] P045V2_n10582Pg_Pk ;
   private java.math.BigDecimal[] P045V2_A10583Pg_Pm ;
   private boolean[] P045V2_n10583Pg_Pm ;
   private int[] P045V2_A252CliCod ;
   private String[] P045V2_A396EmprCod ;
   private short[] P045V2_A10581Pg_Tc ;
   private int[] P045V2_A10580Pg_ColNum ;
   private String[] P045V2_A65ArtCod ;
   private String[] P045V4_A5536Lb_ColNom ;
   private java.math.BigDecimal[] P045V4_A5989Lb_PreKg ;
   private java.math.BigDecimal[] P045V4_A10083Lb_PreMt ;
   private int[] P045V4_A252CliCod ;
   private String[] P045V4_A396EmprCod ;
   private String[] P045V4_A5555Lb_opcion ;
   private int[] P045V4_A5532Lb_numero ;
}

final  class appre002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P045V2", "SELECT Pg_ColNom, Pg_Procod, Pg_Pk, Pg_Pm, CliCod, EmprCod, Pg_Tc, Pg_ColNum, ArtCod FROM TXPPGCOL1 WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, Pg_Procod, Pg_ColNom, Pg_ColNum, Pg_Tc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P045V3", "INSERT INTO TXPPRE001(EmprCod, CliCod, Txt_Cor, ProCod, Txt_ProPk, Txt_ProPm) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRE001")
         ,new ForEachCursor("P045V4", "SELECT T2.Lb_ColNom, T1.Lb_PreKg, T1.Lb_PreMt, T2.CliCod, T1.EmprCod, T1.Lb_opcion, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) WHERE (T1.EmprCod = ?) AND (T1.Lb_PreKg > 0) ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P045V5", "INSERT INTO TXPPRE002(EmprCod, CliCod, Txt_Cor, Txt_CorPk, Txt_CorPm) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRE002")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 13);
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 5);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 13);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               return;
      }
   }

}

