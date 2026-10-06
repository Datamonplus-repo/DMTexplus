package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptosa03 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptosa03 pgm = new aptosa03 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptosa03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptosa03.class ), "" );
   }

   public aptosa03( int remoteHandle ,
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
      AV8Emprcod = "001" ;
      AV9Maqcodi = httpContext.getMessage( "ACFUAA", "") ;
      AV10MaqCodf = httpContext.getMessage( "ACFUZZ", "") ;
      /* Using cursor P03ZM2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, AV9Maqcodi, AV14Act_diai, AV15Act_diaf, AV10MaqCodf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P03ZM2_A396EmprCod[0] ;
         A10279Act_Maq = P03ZM2_A10279Act_Maq[0] ;
         A10287Act_mod = P03ZM2_A10287Act_mod[0] ;
         n10287Act_mod = P03ZM2_n10287Act_mod[0] ;
         A10286Act_vig = P03ZM2_A10286Act_vig[0] ;
         n10286Act_vig = P03ZM2_n10286Act_vig[0] ;
         A10285Act_hmmr = P03ZM2_A10285Act_hmmr[0] ;
         n10285Act_hmmr = P03ZM2_n10285Act_hmmr[0] ;
         A10284Act_hmmt = P03ZM2_A10284Act_hmmt[0] ;
         n10284Act_hmmt = P03ZM2_n10284Act_hmmt[0] ;
         A10283Act_hhprI = P03ZM2_A10283Act_hhprI[0] ;
         n10283Act_hhprI = P03ZM2_n10283Act_hhprI[0] ;
         A10282Act_hhpr = P03ZM2_A10282Act_hhpr[0] ;
         n10282Act_hhpr = P03ZM2_n10282Act_hhpr[0] ;
         A10281Act_hhppI = P03ZM2_A10281Act_hhppI[0] ;
         n10281Act_hhppI = P03ZM2_n10281Act_hhppI[0] ;
         A10280Act_hhpp = P03ZM2_A10280Act_hhpp[0] ;
         n10280Act_hhpp = P03ZM2_n10280Act_hhpp[0] ;
         A10278Act_dia = P03ZM2_A10278Act_dia[0] ;
         A652OpeCod = P03ZM2_A652OpeCod[0] ;
         W396EmprCod = A396EmprCod ;
         AV12Act_hhpp = A10280Act_hhpp ;
         AV13Act_hhpr = A10282Act_hhpr ;
         AV11Maqcod = A10279Act_Maq ;
         if ( GXutil.len( AV11Maqcod) == 6 )
         {
            /*
               INSERT RECORD ON TABLE TXPTR0301

            */
            W396EmprCod = A396EmprCod ;
            W652OpeCod = A652OpeCod ;
            W10278Act_dia = A10278Act_dia ;
            W10279Act_Maq = A10279Act_Maq ;
            W10280Act_hhpp = A10280Act_hhpp ;
            n10280Act_hhpp = false ;
            W10281Act_hhppI = A10281Act_hhppI ;
            n10281Act_hhppI = false ;
            W10282Act_hhpr = A10282Act_hhpr ;
            n10282Act_hhpr = false ;
            W10283Act_hhprI = A10283Act_hhprI ;
            n10283Act_hhprI = false ;
            W10284Act_hmmt = A10284Act_hmmt ;
            n10284Act_hmmt = false ;
            W10285Act_hmmr = A10285Act_hmmr ;
            n10285Act_hmmr = false ;
            W10286Act_vig = A10286Act_vig ;
            n10286Act_vig = false ;
            W10287Act_mod = A10287Act_mod ;
            n10287Act_mod = false ;
            A10279Act_Maq = GXutil.substring( AV11Maqcod, 1, 4) ;
            n10280Act_hhpp = false ;
            n10281Act_hhppI = false ;
            n10282Act_hhpr = false ;
            n10283Act_hhprI = false ;
            n10284Act_hmmt = false ;
            n10285Act_hmmr = false ;
            n10286Act_vig = false ;
            n10287Act_mod = false ;
            /* Using cursor P03ZM3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia, A10279Act_Maq, Boolean.valueOf(n10280Act_hhpp), A10280Act_hhpp, Boolean.valueOf(n10281Act_hhppI), A10281Act_hhppI, Boolean.valueOf(n10282Act_hhpr), A10282Act_hhpr, Boolean.valueOf(n10283Act_hhprI), A10283Act_hhprI, Boolean.valueOf(n10284Act_hmmt), A10284Act_hmmt, Boolean.valueOf(n10285Act_hmmr), A10285Act_hmmr, Boolean.valueOf(n10286Act_vig), A10286Act_vig, Boolean.valueOf(n10287Act_mod), A10287Act_mod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0301");
            if ( (pr_default.getStatus(1) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               n10280Act_hhpp = false ;
               /* Optimized UPDATE. */
               /* Using cursor P03ZM4 */
               pr_default.execute(2, new Object[] {AV12Act_hhpp, A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia, A10279Act_Maq});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0301");
               /* End optimized UPDATE. */
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A652OpeCod = W652OpeCod ;
            A10278Act_dia = W10278Act_dia ;
            A10279Act_Maq = W10279Act_Maq ;
            A10280Act_hhpp = W10280Act_hhpp ;
            n10280Act_hhpp = false ;
            A10281Act_hhppI = W10281Act_hhppI ;
            n10281Act_hhppI = false ;
            A10282Act_hhpr = W10282Act_hhpr ;
            n10282Act_hhpr = false ;
            A10283Act_hhprI = W10283Act_hhprI ;
            n10283Act_hhprI = false ;
            A10284Act_hmmt = W10284Act_hmmt ;
            n10284Act_hmmt = false ;
            A10285Act_hmmr = W10285Act_hmmr ;
            n10285Act_hmmr = false ;
            A10286Act_vig = W10286Act_vig ;
            n10286Act_vig = false ;
            A10287Act_mod = W10287Act_mod ;
            n10287Act_mod = false ;
            /* End Insert */
         }
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin del proceso", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptosa03.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptosa03");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Emprcod = "" ;
      AV9Maqcodi = "" ;
      AV10MaqCodf = "" ;
      scmdbuf = "" ;
      AV14Act_diai = GXutil.nullDate() ;
      AV15Act_diaf = GXutil.nullDate() ;
      P03ZM2_A396EmprCod = new String[] {""} ;
      P03ZM2_A10279Act_Maq = new String[] {""} ;
      P03ZM2_A10287Act_mod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ZM2_n10287Act_mod = new boolean[] {false} ;
      P03ZM2_A10286Act_vig = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ZM2_n10286Act_vig = new boolean[] {false} ;
      P03ZM2_A10285Act_hmmr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ZM2_n10285Act_hmmr = new boolean[] {false} ;
      P03ZM2_A10284Act_hmmt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ZM2_n10284Act_hmmt = new boolean[] {false} ;
      P03ZM2_A10283Act_hhprI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ZM2_n10283Act_hhprI = new boolean[] {false} ;
      P03ZM2_A10282Act_hhpr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ZM2_n10282Act_hhpr = new boolean[] {false} ;
      P03ZM2_A10281Act_hhppI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ZM2_n10281Act_hhppI = new boolean[] {false} ;
      P03ZM2_A10280Act_hhpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ZM2_n10280Act_hhpp = new boolean[] {false} ;
      P03ZM2_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      P03ZM2_A652OpeCod = new int[1] ;
      A396EmprCod = "" ;
      A10279Act_Maq = "" ;
      A10287Act_mod = DecimalUtil.ZERO ;
      A10286Act_vig = DecimalUtil.ZERO ;
      A10285Act_hmmr = DecimalUtil.ZERO ;
      A10284Act_hmmt = DecimalUtil.ZERO ;
      A10283Act_hhprI = DecimalUtil.ZERO ;
      A10282Act_hhpr = DecimalUtil.ZERO ;
      A10281Act_hhppI = DecimalUtil.ZERO ;
      A10280Act_hhpp = DecimalUtil.ZERO ;
      A10278Act_dia = GXutil.nullDate() ;
      W396EmprCod = "" ;
      AV12Act_hhpp = DecimalUtil.ZERO ;
      AV13Act_hhpr = DecimalUtil.ZERO ;
      AV11Maqcod = "" ;
      W10278Act_dia = GXutil.nullDate() ;
      W10279Act_Maq = "" ;
      W10280Act_hhpp = DecimalUtil.ZERO ;
      W10281Act_hhppI = DecimalUtil.ZERO ;
      W10282Act_hhpr = DecimalUtil.ZERO ;
      W10283Act_hhprI = DecimalUtil.ZERO ;
      W10284Act_hmmt = DecimalUtil.ZERO ;
      W10285Act_hmmr = DecimalUtil.ZERO ;
      W10286Act_vig = DecimalUtil.ZERO ;
      W10287Act_mod = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptosa03__default(),
         new Object[] {
             new Object[] {
            P03ZM2_A396EmprCod, P03ZM2_A10279Act_Maq, P03ZM2_A10287Act_mod, P03ZM2_n10287Act_mod, P03ZM2_A10286Act_vig, P03ZM2_n10286Act_vig, P03ZM2_A10285Act_hmmr, P03ZM2_n10285Act_hmmr, P03ZM2_A10284Act_hmmt, P03ZM2_n10284Act_hmmt,
            P03ZM2_A10283Act_hhprI, P03ZM2_n10283Act_hhprI, P03ZM2_A10282Act_hhpr, P03ZM2_n10282Act_hhpr, P03ZM2_A10281Act_hhppI, P03ZM2_n10281Act_hhppI, P03ZM2_A10280Act_hhpp, P03ZM2_n10280Act_hhpp, P03ZM2_A10278Act_dia, P03ZM2_A652OpeCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A652OpeCod ;
   private int GX_INS1396 ;
   private int W652OpeCod ;
   private java.math.BigDecimal A10287Act_mod ;
   private java.math.BigDecimal A10286Act_vig ;
   private java.math.BigDecimal A10285Act_hmmr ;
   private java.math.BigDecimal A10284Act_hmmt ;
   private java.math.BigDecimal A10283Act_hhprI ;
   private java.math.BigDecimal A10282Act_hhpr ;
   private java.math.BigDecimal A10281Act_hhppI ;
   private java.math.BigDecimal A10280Act_hhpp ;
   private java.math.BigDecimal AV12Act_hhpp ;
   private java.math.BigDecimal AV13Act_hhpr ;
   private java.math.BigDecimal W10280Act_hhpp ;
   private java.math.BigDecimal W10281Act_hhppI ;
   private java.math.BigDecimal W10282Act_hhpr ;
   private java.math.BigDecimal W10283Act_hhprI ;
   private java.math.BigDecimal W10284Act_hmmt ;
   private java.math.BigDecimal W10285Act_hmmr ;
   private java.math.BigDecimal W10286Act_vig ;
   private java.math.BigDecimal W10287Act_mod ;
   private String AV8Emprcod ;
   private String AV9Maqcodi ;
   private String AV10MaqCodf ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A10279Act_Maq ;
   private String W396EmprCod ;
   private String AV11Maqcod ;
   private String W10279Act_Maq ;
   private String Gx_emsg ;
   private java.util.Date AV14Act_diai ;
   private java.util.Date AV15Act_diaf ;
   private java.util.Date A10278Act_dia ;
   private java.util.Date W10278Act_dia ;
   private boolean n10287Act_mod ;
   private boolean n10286Act_vig ;
   private boolean n10285Act_hmmr ;
   private boolean n10284Act_hmmt ;
   private boolean n10283Act_hhprI ;
   private boolean n10282Act_hhpr ;
   private boolean n10281Act_hhppI ;
   private boolean n10280Act_hhpp ;
   private IDataStoreProvider pr_default ;
   private String[] P03ZM2_A396EmprCod ;
   private String[] P03ZM2_A10279Act_Maq ;
   private java.math.BigDecimal[] P03ZM2_A10287Act_mod ;
   private boolean[] P03ZM2_n10287Act_mod ;
   private java.math.BigDecimal[] P03ZM2_A10286Act_vig ;
   private boolean[] P03ZM2_n10286Act_vig ;
   private java.math.BigDecimal[] P03ZM2_A10285Act_hmmr ;
   private boolean[] P03ZM2_n10285Act_hmmr ;
   private java.math.BigDecimal[] P03ZM2_A10284Act_hmmt ;
   private boolean[] P03ZM2_n10284Act_hmmt ;
   private java.math.BigDecimal[] P03ZM2_A10283Act_hhprI ;
   private boolean[] P03ZM2_n10283Act_hhprI ;
   private java.math.BigDecimal[] P03ZM2_A10282Act_hhpr ;
   private boolean[] P03ZM2_n10282Act_hhpr ;
   private java.math.BigDecimal[] P03ZM2_A10281Act_hhppI ;
   private boolean[] P03ZM2_n10281Act_hhppI ;
   private java.math.BigDecimal[] P03ZM2_A10280Act_hhpp ;
   private boolean[] P03ZM2_n10280Act_hhpp ;
   private java.util.Date[] P03ZM2_A10278Act_dia ;
   private int[] P03ZM2_A652OpeCod ;
}

final  class aptosa03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03ZM2", "SELECT EmprCod, Act_Maq, Act_mod, Act_vig, Act_hmmr, Act_hmmt, Act_hhprI, Act_hhpr, Act_hhppI, Act_hhpp, Act_dia, OpeCod FROM TXPTR0301 WHERE (EmprCod = ? and Act_Maq >= ? and Act_dia >= ?) AND (Act_dia <= ?) AND (Act_Maq <= ?) ORDER BY EmprCod, Act_Maq, Act_dia ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03ZM3", "INSERT INTO TXPTR0301(EmprCod, OpeCod, Act_dia, Act_Maq, Act_hhpp, Act_hhppI, Act_hhpr, Act_hhprI, Act_hmmt, Act_hmmr, Act_vig, Act_mod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTR0301")
         ,new UpdateCursor("P03ZM4", "UPDATE TXPTR0301 SET Act_hhpp=Act_hhpp + ?  WHERE EmprCod = ? and OpeCod = ? and Act_dia = ? and Act_Maq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTR0301")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(11);
               ((int[]) buf[19])[0] = rslt.getInt(12);
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
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[19], 2);
               }
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

