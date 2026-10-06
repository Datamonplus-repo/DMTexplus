package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plibrec extends GXProcedure
{
   public plibrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plibrec.class ), "" );
   }

   public plibrec( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 ,
                                     String[] aP2 )
   {
      plibrec.this.aP3 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 )
   {
      plibrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plibrec.this.AV15PProd = aP1[0];
      this.aP1 = aP1;
      plibrec.this.AV16UProd = aP2[0];
      this.aP2 = aP2;
      plibrec.this.AV18FecRec = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      plibrec.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV21Emprnom ;
      GXv_char4[0] = AV22Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      plibrec.this.A396EmprCod = GXv_char2[0] ;
      plibrec.this.AV21Emprnom = GXv_char3[0] ;
      plibrec.this.AV22Usurcod = GXv_char4[0] ;
      GXt_int5 = AV23Nalmcc ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV24EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int6) ;
      plibrec.this.GXt_int5 = GXv_int6[0] ;
      AV23Nalmcc = GXt_int5 ;
      /* Using cursor P002V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15PProd, AV16UProd});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A727PrdRec = P002V2_A727PrdRec[0] ;
         A719PrdNum = P002V2_A719PrdNum[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            A727PrdRec = httpContext.getMessage( "N", "") ;
            AV17PrdNum = A719PrdNum ;
            /* Execute user subroutine: 'RECUEN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'INVPRD' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P002V3 */
            pr_default.execute(1, new Object[] {A727PrdRec, A396EmprCod, A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV19Texto = httpContext.getMessage( "Eliminacion RECUENTO, Fecha =", "") + localUtil.dtoc( AV18FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV28Pgmname, AV22Usurcod, AV20Station, AV19Texto, 99999999, (byte)(0), " ") ;
      cleanup();
   }

   public void S111( )
   {
      /* 'RECUEN' Routine */
      returnInSub = false ;
      /* Using cursor P002V4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV17PrdNum, AV18FecRec});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A810RecFec = P002V4_A810RecFec[0] ;
         A719PrdNum = P002V4_A719PrdNum[0] ;
         /* Optimized DELETE. */
         /* Using cursor P002V5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECALM");
         /* End optimized DELETE. */
         /* Using cursor P002V6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'INVPRD' Routine */
      returnInSub = false ;
      /* Using cursor P002V7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV17PrdNum});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A719PrdNum = P002V7_A719PrdNum[0] ;
         A8583RecInvSt = P002V7_A8583RecInvSt[0] ;
         n8583RecInvSt = P002V7_n8583RecInvSt[0] ;
         A8577RecFecHr = P002V7_A8577RecFecHr[0] ;
         /* Optimized DELETE. */
         /* Using cursor P002V8 */
         pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, A8577RecFecHr});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVALM");
         /* End optimized DELETE. */
         /* Using cursor P002V9 */
         pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, A8577RecFecHr});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVPRD");
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = plibrec.this.A396EmprCod;
      this.aP1[0] = plibrec.this.AV15PProd;
      this.aP2[0] = plibrec.this.AV16UProd;
      this.aP3[0] = plibrec.this.AV18FecRec;
      Application.commitDataStores(context, remoteHandle, pr_default, "plibrec");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV21Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV22Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV24EmprCod = "" ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P002V2_A396EmprCod = new String[] {""} ;
      P002V2_A727PrdRec = new String[] {""} ;
      P002V2_A719PrdNum = new String[] {""} ;
      A727PrdRec = "" ;
      A719PrdNum = "" ;
      AV17PrdNum = "" ;
      AV19Texto = "" ;
      AV28Pgmname = "" ;
      P002V4_A396EmprCod = new String[] {""} ;
      P002V4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P002V4_A719PrdNum = new String[] {""} ;
      A810RecFec = GXutil.nullDate() ;
      P002V7_A396EmprCod = new String[] {""} ;
      P002V7_A719PrdNum = new String[] {""} ;
      P002V7_A8583RecInvSt = new byte[1] ;
      P002V7_n8583RecInvSt = new boolean[] {false} ;
      P002V7_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      A8577RecFecHr = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plibrec__default(),
         new Object[] {
             new Object[] {
            P002V2_A396EmprCod, P002V2_A727PrdRec, P002V2_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P002V4_A396EmprCod, P002V4_A810RecFec, P002V4_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P002V7_A396EmprCod, P002V7_A719PrdNum, P002V7_A8583RecInvSt, P002V7_n8583RecInvSt, P002V7_A8577RecFecHr
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV28Pgmname = "PLIBREC" ;
      /* GeneXus formulas. */
      AV28Pgmname = "PLIBREC" ;
      Gx_err = (short)(0) ;
   }

   private byte AV23Nalmcc ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A8583RecInvSt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV15PProd ;
   private String AV16UProd ;
   private String AV20Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV21Emprnom ;
   private String GXv_char3[] ;
   private String AV22Usurcod ;
   private String GXv_char4[] ;
   private String AV24EmprCod ;
   private String scmdbuf ;
   private String A727PrdRec ;
   private String A719PrdNum ;
   private String AV17PrdNum ;
   private String AV28Pgmname ;
   private java.util.Date A8577RecFecHr ;
   private java.util.Date AV18FecRec ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean n8583RecInvSt ;
   private String AV19Texto ;
   private java.util.Date[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P002V2_A396EmprCod ;
   private String[] P002V2_A727PrdRec ;
   private String[] P002V2_A719PrdNum ;
   private String[] P002V4_A396EmprCod ;
   private java.util.Date[] P002V4_A810RecFec ;
   private String[] P002V4_A719PrdNum ;
   private String[] P002V7_A396EmprCod ;
   private String[] P002V7_A719PrdNum ;
   private byte[] P002V7_A8583RecInvSt ;
   private boolean[] P002V7_n8583RecInvSt ;
   private java.util.Date[] P002V7_A8577RecFecHr ;
}

final  class plibrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002V2", "SELECT EmprCod, PrdRec, PrdNum FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (PrdNum <= ?) ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002V3", "UPDATE TXPPRODUC SET PrdRec=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P002V4", "SELECT EmprCod, RecFec, PrdNum FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P002V5", "DELETE FROM TXPRECALM  WHERE EmprCod = ? and PrdNum = ? and RecFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECALM")
         ,new UpdateCursor("P002V6", "DELETE FROM TXPRECUEN  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECUEN")
         ,new ForEachCursor("P002V7", "SELECT EmprCod, PrdNum, RecInvSt, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? and PrdNum = ? and RecInvSt = 0 ORDER BY EmprCod, PrdNum, RecInvSt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002V8", "DELETE FROM TXPINVALM  WHERE EmprCod = ? and PrdNum = ? and RecFecHr = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINVALM")
         ,new UpdateCursor("P002V9", "DELETE FROM TXPINVPRD  WHERE EmprCod = ? AND PrdNum = ? AND RecFecHr = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINVPRD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
      }
   }

}

