package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccartc extends GXProcedure
{
   public pccartc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccartc.class ), "" );
   }

   public pccartc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pccartc.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pccartc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccartc.this.AV13CliCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV15Bros ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int2) ;
      pccartc.this.GXt_int1 = GXv_int2[0] ;
      AV15Bros = GXt_int1 ;
      if ( AV15Bros == 1 )
      {
         AV16Cctcod = 1 ;
      }
      /* Using cursor P02FV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02FV2_A252CliCod[0] ;
         AV14CliCodd = A252CliCod ;
         if ( AV15Bros == 1 )
         {
            /* Execute user subroutine: 'CC_1' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            Gx_msg = httpContext.getMessage( "Procesando Cliente... ", "") + GXutil.str( A252CliCod, 6, 0) ;
            System.out.println( Gx_msg );
            /* Execute user subroutine: 'CC' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CC' Routine */
      returnInSub = false ;
      /* Using cursor P02FV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P02FV3_A252CliCod[0] ;
         A4059CCFColNum = P02FV3_A4059CCFColNum[0] ;
         A4058CCFColNom = P02FV3_A4058CCFColNom[0] ;
         A65ArtCod = P02FV3_A65ArtCod[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         Gx_msg = httpContext.getMessage( "Alta tabla CCSERI", "") + httpContext.getMessage( " Cliente = ", "") + GXutil.str( AV14CliCodd, 6, 0) ;
         System.out.println( Gx_msg );
         /*
            INSERT RECORD ON TABLE TXPCCSeri

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W4058CCFColNom = A4058CCFColNom ;
         W4059CCFColNum = A4059CCFColNum ;
         A252CliCod = AV14CliCodd ;
         /* Using cursor P02FV4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSeri");
         if ( (pr_default.getStatus(2) == 1) )
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
         A65ArtCod = W65ArtCod ;
         A4058CCFColNom = W4058CCFColNom ;
         A4059CCFColNum = W4059CCFColNum ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P02FV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV13CliCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = P02FV5_A252CliCod[0] ;
         A4031CCTCod = P02FV5_A4031CCTCod[0] ;
         A4059CCFColNum = P02FV5_A4059CCFColNum[0] ;
         A4058CCFColNom = P02FV5_A4058CCFColNom[0] ;
         A65ArtCod = P02FV5_A65ArtCod[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         Gx_msg = httpContext.getMessage( "Alta tabla CCSER1", "") + httpContext.getMessage( " Cliente = ", "") + GXutil.str( AV14CliCodd, 6, 0) ;
         System.out.println( Gx_msg );
         /*
            INSERT RECORD ON TABLE TXPCCSer1

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W4058CCFColNom = A4058CCFColNom ;
         W4059CCFColNum = A4059CCFColNum ;
         W4031CCTCod = A4031CCTCod ;
         A252CliCod = AV14CliCodd ;
         /* Using cursor P02FV6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSer1");
         if ( (pr_default.getStatus(4) == 1) )
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
         A65ArtCod = W65ArtCod ;
         A4058CCFColNom = W4058CCFColNom ;
         A4059CCFColNum = W4059CCFColNum ;
         A4031CCTCod = W4031CCTCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'CC_1' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPCCSeri

      */
      A252CliCod = AV14CliCodd ;
      A65ArtCod = " " ;
      A4058CCFColNom = " " ;
      A4059CCFColNum = 0 ;
      /* Using cursor P02FV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSeri");
      if ( (pr_default.getStatus(5) == 1) )
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
      /*
         INSERT RECORD ON TABLE TXPCCSer1

      */
      A252CliCod = AV14CliCodd ;
      A65ArtCod = " " ;
      A4058CCFColNom = " " ;
      A4059CCFColNum = 0 ;
      A4031CCTCod = 1 ;
      /* Using cursor P02FV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSer1");
      if ( (pr_default.getStatus(6) == 1) )
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

   protected void cleanup( )
   {
      this.aP0[0] = pccartc.this.A396EmprCod;
      this.aP1[0] = pccartc.this.AV13CliCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pccartc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P02FV2_A396EmprCod = new String[] {""} ;
      P02FV2_A252CliCod = new int[1] ;
      Gx_msg = "" ;
      P02FV3_A396EmprCod = new String[] {""} ;
      P02FV3_A252CliCod = new int[1] ;
      P02FV3_A4059CCFColNum = new int[1] ;
      P02FV3_A4058CCFColNom = new String[] {""} ;
      P02FV3_A65ArtCod = new String[] {""} ;
      A4058CCFColNom = "" ;
      A65ArtCod = "" ;
      W396EmprCod = "" ;
      W65ArtCod = "" ;
      W4058CCFColNom = "" ;
      Gx_emsg = "" ;
      P02FV5_A396EmprCod = new String[] {""} ;
      P02FV5_A252CliCod = new int[1] ;
      P02FV5_A4031CCTCod = new int[1] ;
      P02FV5_A4059CCFColNum = new int[1] ;
      P02FV5_A4058CCFColNom = new String[] {""} ;
      P02FV5_A65ArtCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccartc__default(),
         new Object[] {
             new Object[] {
            P02FV2_A396EmprCod, P02FV2_A252CliCod
            }
            , new Object[] {
            P02FV3_A396EmprCod, P02FV3_A252CliCod, P02FV3_A4059CCFColNum, P02FV3_A4058CCFColNom, P02FV3_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02FV5_A396EmprCod, P02FV5_A252CliCod, P02FV5_A4031CCTCod, P02FV5_A4059CCFColNum, P02FV5_A4058CCFColNom, P02FV5_A65ArtCod
            }
            , new Object[] {
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

   private byte AV15Bros ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int AV13CliCod ;
   private int AV16Cctcod ;
   private int A252CliCod ;
   private int AV14CliCodd ;
   private int A4059CCFColNum ;
   private int W252CliCod ;
   private int GX_INS627 ;
   private int W4059CCFColNum ;
   private int A4031CCTCod ;
   private int GX_INS628 ;
   private int W4031CCTCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String A4058CCFColNom ;
   private String A65ArtCod ;
   private String W396EmprCod ;
   private String W65ArtCod ;
   private String W4058CCFColNom ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02FV2_A396EmprCod ;
   private int[] P02FV2_A252CliCod ;
   private String[] P02FV3_A396EmprCod ;
   private int[] P02FV3_A252CliCod ;
   private int[] P02FV3_A4059CCFColNum ;
   private String[] P02FV3_A4058CCFColNom ;
   private String[] P02FV3_A65ArtCod ;
   private String[] P02FV5_A396EmprCod ;
   private int[] P02FV5_A252CliCod ;
   private int[] P02FV5_A4031CCTCod ;
   private int[] P02FV5_A4059CCFColNum ;
   private String[] P02FV5_A4058CCFColNom ;
   private String[] P02FV5_A65ArtCod ;
}

final  class pccartc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02FV2", "SELECT EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod <> ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02FV3", "SELECT EmprCod, CliCod, CCFColNum, CCFColNom, ArtCod FROM TXPCCSeri WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02FV4", "INSERT INTO TXPCCSeri(EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSeri")
         ,new ForEachCursor("P02FV5", "SELECT EmprCod, CliCod, CCTCod, CCFColNum, CCFColNom, ArtCod FROM TXPCCSer1 WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02FV6", "INSERT INTO TXPCCSer1(EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSer1")
         ,new UpdateCursor("P02FV7", "INSERT INTO TXPCCSeri(EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSeri")
         ,new UpdateCursor("P02FV8", "INSERT INTO TXPCCSer1(EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSer1")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

