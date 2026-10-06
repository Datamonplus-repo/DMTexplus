package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apusuemp2 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apusuemp2 pgm = new apusuemp2 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apusuemp2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apusuemp2.class ), "" );
   }

   public apusuemp2( int remoteHandle ,
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
      AV15EmprCod = "001" ;
      /* Using cursor P007I2 */
      pr_default.execute(0, new Object[] {AV15EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P007I2_A396EmprCod[0] ;
         A10061CliEvLast = P007I2_A10061CliEvLast[0] ;
         n10061CliEvLast = P007I2_n10061CliEvLast[0] ;
         A252CliCod = P007I2_A252CliCod[0] ;
         AV23Clicod = A252CliCod ;
         /* Execute user subroutine: 'CLIENV' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A10061CliEvLast = AV24CliEnvLin ;
         n10061CliEvLast = false ;
         /* Using cursor P007I3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n10061CliEvLast), Short.valueOf(A10061CliEvLast), A396EmprCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Creacion CLISEND", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'CLIENV' Routine */
      returnInSub = false ;
      /* Using cursor P007I4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV23Clicod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A252CliCod = P007I4_A252CliCod[0] ;
         A396EmprCod = P007I4_A396EmprCod[0] ;
         A265CliEnvDom = P007I4_A265CliEnvDom[0] ;
         A267CliEnvNom = P007I4_A267CliEnvNom[0] ;
         A5530CliEnvDm2 = P007I4_A5530CliEnvDm2[0] ;
         A5531CliEnvNm2 = P007I4_A5531CliEnvNm2[0] ;
         A268CliEnvPob = P007I4_A268CliEnvPob[0] ;
         A264CliEnvCp = P007I4_A264CliEnvCp[0] ;
         A266CliEnvLin = P007I4_A266CliEnvLin[0] ;
         AV17Clienvdom = A265CliEnvDom ;
         AV18Clienvnom = A267CliEnvNom ;
         AV19Clienvdm2 = A5530CliEnvDm2 ;
         AV20CliEnvNm2 = A5531CliEnvNm2 ;
         AV21CliEnvPob = A268CliEnvPob ;
         AV22CliEnvCp = A264CliEnvCp ;
         AV23Clicod = A252CliCod ;
         AV24CliEnvLin = A266CliEnvLin ;
         /* Execute user subroutine: 'CLISEND' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S123( )
   {
      /* 'CLISEND' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPCLISEN

      */
      A396EmprCod = AV15EmprCod ;
      A252CliCod = AV23Clicod ;
      A10062CliEvLin = AV24CliEnvLin ;
      A10066CliEvCp = AV22CliEnvCp ;
      n10066CliEvCp = false ;
      A10064CliEvDom = AV17Clienvdom + GXutil.trim( AV19Clienvdm2) ;
      n10064CliEvDom = false ;
      A10070CliEvFax = " " ;
      n10070CliEvFax = false ;
      A10069CliEvMail = " " ;
      n10069CliEvMail = false ;
      A10063CliEvNom = AV18Clienvnom + GXutil.trim( AV20CliEnvNm2) ;
      n10063CliEvNom = false ;
      A10065CliEvPob = AV21CliEnvPob ;
      n10065CliEvPob = false ;
      A10067CliEvPrv = AV16CliEnvPrv ;
      n10067CliEvPrv = false ;
      /* Using cursor P007I5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A10062CliEvLin), Boolean.valueOf(n10063CliEvNom), A10063CliEvNom, Boolean.valueOf(n10064CliEvDom), A10064CliEvDom, Boolean.valueOf(n10065CliEvPob), A10065CliEvPob, Boolean.valueOf(n10066CliEvCp), A10066CliEvCp, Boolean.valueOf(n10067CliEvPrv), Short.valueOf(A10067CliEvPrv), Boolean.valueOf(n10069CliEvMail), A10069CliEvMail, Boolean.valueOf(n10070CliEvFax), A10070CliEvFax});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLISEN");
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
      /* End Insert */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pusuemp2.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apusuemp2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15EmprCod = "" ;
      scmdbuf = "" ;
      P007I2_A396EmprCod = new String[] {""} ;
      P007I2_A10061CliEvLast = new short[1] ;
      P007I2_n10061CliEvLast = new boolean[] {false} ;
      P007I2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      P007I4_A252CliCod = new int[1] ;
      P007I4_A396EmprCod = new String[] {""} ;
      P007I4_A265CliEnvDom = new String[] {""} ;
      P007I4_A267CliEnvNom = new String[] {""} ;
      P007I4_A5530CliEnvDm2 = new String[] {""} ;
      P007I4_A5531CliEnvNm2 = new String[] {""} ;
      P007I4_A268CliEnvPob = new String[] {""} ;
      P007I4_A264CliEnvCp = new String[] {""} ;
      P007I4_A266CliEnvLin = new byte[1] ;
      A265CliEnvDom = "" ;
      A267CliEnvNom = "" ;
      A5530CliEnvDm2 = "" ;
      A5531CliEnvNm2 = "" ;
      A268CliEnvPob = "" ;
      A264CliEnvCp = "" ;
      AV17Clienvdom = "" ;
      AV18Clienvnom = "" ;
      AV19Clienvdm2 = "" ;
      AV20CliEnvNm2 = "" ;
      AV21CliEnvPob = "" ;
      AV22CliEnvCp = "" ;
      A10066CliEvCp = "" ;
      A10064CliEvDom = "" ;
      A10070CliEvFax = "" ;
      A10069CliEvMail = "" ;
      A10063CliEvNom = "" ;
      A10065CliEvPob = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apusuemp2__default(),
         new Object[] {
             new Object[] {
            P007I2_A396EmprCod, P007I2_A10061CliEvLast, P007I2_n10061CliEvLast, P007I2_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P007I4_A252CliCod, P007I4_A396EmprCod, P007I4_A265CliEnvDom, P007I4_A267CliEnvNom, P007I4_A5530CliEnvDm2, P007I4_A5531CliEnvNm2, P007I4_A268CliEnvPob, P007I4_A264CliEnvCp, P007I4_A266CliEnvLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24CliEnvLin ;
   private byte A266CliEnvLin ;
   private short A10061CliEvLast ;
   private short A10062CliEvLin ;
   private short A10067CliEvPrv ;
   private short AV16CliEnvPrv ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV23Clicod ;
   private int GX_INS1367 ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A265CliEnvDom ;
   private String A267CliEnvNom ;
   private String A5530CliEnvDm2 ;
   private String A5531CliEnvNm2 ;
   private String A268CliEnvPob ;
   private String A264CliEnvCp ;
   private String AV17Clienvdom ;
   private String AV18Clienvnom ;
   private String AV19Clienvdm2 ;
   private String AV20CliEnvNm2 ;
   private String AV21CliEnvPob ;
   private String AV22CliEnvCp ;
   private String A10066CliEvCp ;
   private String A10064CliEvDom ;
   private String A10070CliEvFax ;
   private String A10069CliEvMail ;
   private String A10063CliEvNom ;
   private String A10065CliEvPob ;
   private String Gx_emsg ;
   private boolean n10061CliEvLast ;
   private boolean returnInSub ;
   private boolean n10066CliEvCp ;
   private boolean n10064CliEvDom ;
   private boolean n10070CliEvFax ;
   private boolean n10069CliEvMail ;
   private boolean n10063CliEvNom ;
   private boolean n10065CliEvPob ;
   private boolean n10067CliEvPrv ;
   private IDataStoreProvider pr_default ;
   private String[] P007I2_A396EmprCod ;
   private short[] P007I2_A10061CliEvLast ;
   private boolean[] P007I2_n10061CliEvLast ;
   private int[] P007I2_A252CliCod ;
   private int[] P007I4_A252CliCod ;
   private String[] P007I4_A396EmprCod ;
   private String[] P007I4_A265CliEnvDom ;
   private String[] P007I4_A267CliEnvNom ;
   private String[] P007I4_A5530CliEnvDm2 ;
   private String[] P007I4_A5531CliEnvNm2 ;
   private String[] P007I4_A268CliEnvPob ;
   private String[] P007I4_A264CliEnvCp ;
   private byte[] P007I4_A266CliEnvLin ;
}

final  class apusuemp2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007I2", "SELECT EmprCod, CliEvLast, CliCod FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P007I3", "UPDATE TXPCLIENT SET CliEvLast=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
         ,new ForEachCursor("P007I4", "SELECT CliCod, EmprCod, CliEnvDom, CliEnvNom, CliEnvDm2, CliEnvNm2, CliEnvPob, CliEnvCp, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P007I5", "INSERT INTO TXPCLISEN(EmprCod, CliCod, CliEvLin, CliEvNom, CliEvDom, CliEvPob, CliEvCp, CliEvPrv, CliEvMail, CliEvFax) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLISEN")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 34);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 80);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 80);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 80);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 12);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 20);
               }
               return;
      }
   }

}

