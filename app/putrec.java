package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class putrec extends GXProcedure
{
   public putrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( putrec.class ), "" );
   }

   public putrec( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 )
   {
      putrec.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 )
   {
      putrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      putrec.this.AV15RecFec = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Procesando tabla RECUEN", "") );
      /* Using cursor P02JT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15RecFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = P02JT2_A810RecFec[0] ;
         A6573RecPreRec = P02JT2_A6573RecPreRec[0] ;
         A718PrdNom = P02JT2_A718PrdNom[0] ;
         A719PrdNum = P02JT2_A719PrdNum[0] ;
         A718PrdNom = P02JT2_A718PrdNom[0] ;
         AV14Prdnum = A719PrdNum ;
         /* Execute user subroutine: 'CCSTKS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A6573RecPreRec = AV16Ccstkpre ;
         Gx_msg = httpContext.getMessage( "Prdnum=", "") + A719PrdNum + " " + A718PrdNom + " " + GXutil.str( A6573RecPreRec, 11, 5) ;
         System.out.println( Gx_msg );
         /* Using cursor P02JT3 */
         pr_default.execute(1, new Object[] {A6573RecPreRec, A396EmprCod, A719PrdNum, A810RecFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'CCSTKS' Routine */
      returnInSub = false ;
      AV16Ccstkpre = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02JT4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV14Prdnum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P02JT4_A719PrdNum[0] ;
         A3345TipMovCc = P02JT4_A3345TipMovCc[0] ;
         A3349CCStkPre = P02JT4_A3349CCStkPre[0] ;
         A3348CCStkFec = P02JT4_A3348CCStkFec[0] ;
         A3342CCStkLin = P02JT4_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV16Ccstkpre = A3349CCStkPre ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = putrec.this.A396EmprCod;
      this.aP1[0] = putrec.this.AV15RecFec;
      Application.commitDataStores(context, remoteHandle, pr_default, "putrec");
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
      P02JT2_A396EmprCod = new String[] {""} ;
      P02JT2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02JT2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02JT2_A718PrdNom = new String[] {""} ;
      P02JT2_A719PrdNum = new String[] {""} ;
      A810RecFec = GXutil.nullDate() ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV14Prdnum = "" ;
      AV16Ccstkpre = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      P02JT4_A396EmprCod = new String[] {""} ;
      P02JT4_A719PrdNum = new String[] {""} ;
      P02JT4_A3345TipMovCc = new String[] {""} ;
      P02JT4_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02JT4_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02JT4_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3348CCStkFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.putrec__default(),
         new Object[] {
             new Object[] {
            P02JT2_A396EmprCod, P02JT2_A810RecFec, P02JT2_A6573RecPreRec, P02JT2_A718PrdNom, P02JT2_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P02JT4_A396EmprCod, P02JT4_A719PrdNum, P02JT4_A3345TipMovCc, P02JT4_A3349CCStkPre, P02JT4_A3348CCStkFec, P02JT4_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV16Ccstkpre ;
   private java.math.BigDecimal A3349CCStkPre ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV14Prdnum ;
   private String Gx_msg ;
   private String A3345TipMovCc ;
   private java.util.Date AV15RecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date A3348CCStkFec ;
   private boolean returnInSub ;
   private java.util.Date[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02JT2_A396EmprCod ;
   private java.util.Date[] P02JT2_A810RecFec ;
   private java.math.BigDecimal[] P02JT2_A6573RecPreRec ;
   private String[] P02JT2_A718PrdNom ;
   private String[] P02JT2_A719PrdNum ;
   private String[] P02JT4_A396EmprCod ;
   private String[] P02JT4_A719PrdNum ;
   private String[] P02JT4_A3345TipMovCc ;
   private java.math.BigDecimal[] P02JT4_A3349CCStkPre ;
   private java.util.Date[] P02JT4_A3348CCStkFec ;
   private long[] P02JT4_A3342CCStkLin ;
}

final  class putrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02JT2", "SELECT T1.EmprCod, T1.RecFec, T1.RecPreRec, T2.PrdNom, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.RecFec = ? ORDER BY T1.EmprCod, T1.RecFec, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02JT3", "UPDATE TXPRECUEN SET RecPreRec=?  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECUEN")
         ,new ForEachCursor("P02JT4", "SELECT EmprCod, PrdNum, TipMovCc, CCStkPre, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CCStkFec DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

