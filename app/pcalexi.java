package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalexi extends GXProcedure
{
   public pcalexi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalexi.class ), "" );
   }

   public pcalexi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String aP1 ,
                                           java.util.Date aP2 ,
                                           java.util.Date aP3 ,
                                           java.util.Date aP4 )
   {
      pcalexi.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pcalexi.this.A396EmprCod = aP0;
      pcalexi.this.AV8PrdNum = aP1;
      pcalexi.this.AV10FecIni = aP2;
      pcalexi.this.AV12PFecha = aP3;
      pcalexi.this.AV13Ufecha = aP4;
      pcalexi.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9EntUniEnt = DecimalUtil.doubleToDec(0) ;
      AV11Recuen = (byte)(0) ;
      AV10FecIni = AV12PFecha ;
      /* Using cursor P02LA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum, AV10FecIni});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = P02LA2_A810RecFec[0] ;
         A719PrdNum = P02LA2_A719PrdNum[0] ;
         A807RecExiRea = P02LA2_A807RecExiRea[0] ;
         AV9EntUniEnt = AV9EntUniEnt.add(A807RecExiRea) ;
         AV11Recuen = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11Recuen == 0 )
      {
         /* Using cursor P02LA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV8PrdNum, AV10FecIni});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P02LA3_A719PrdNum[0] ;
            A810RecFec = P02LA3_A810RecFec[0] ;
            A807RecExiRea = P02LA3_A807RecExiRea[0] ;
            AV9EntUniEnt = AV9EntUniEnt.add(A807RecExiRea) ;
            AV11Recuen = (byte)(1) ;
            AV10FecIni = A810RecFec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      /* Using cursor P02LA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV8PrdNum, AV10FecIni, AV13Ufecha});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A415EntFecEnt = P02LA4_A415EntFecEnt[0] ;
         A719PrdNum = P02LA4_A719PrdNum[0] ;
         A11Albaran = P02LA4_A11Albaran[0] ;
         A418EntUniEnt = P02LA4_A418EntUniEnt[0] ;
         A597LinEnt = P02LA4_A597LinEnt[0] ;
         if ( GXutil.strcmp(GXutil.substring( A11Albaran, 1, 3), httpContext.getMessage( "REC.", "")) != 0 )
         {
            AV9EntUniEnt = AV9EntUniEnt.add(A418EntUniEnt) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pcalexi.this.AV9EntUniEnt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9EntUniEnt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02LA2_A396EmprCod = new String[] {""} ;
      P02LA2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02LA2_A719PrdNum = new String[] {""} ;
      P02LA2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A810RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A807RecExiRea = DecimalUtil.ZERO ;
      P02LA3_A396EmprCod = new String[] {""} ;
      P02LA3_A719PrdNum = new String[] {""} ;
      P02LA3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02LA3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LA4_A396EmprCod = new String[] {""} ;
      P02LA4_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P02LA4_A719PrdNum = new String[] {""} ;
      P02LA4_A11Albaran = new String[] {""} ;
      P02LA4_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LA4_A597LinEnt = new short[1] ;
      A415EntFecEnt = GXutil.nullDate() ;
      A11Albaran = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalexi__default(),
         new Object[] {
             new Object[] {
            P02LA2_A396EmprCod, P02LA2_A810RecFec, P02LA2_A719PrdNum, P02LA2_A807RecExiRea
            }
            , new Object[] {
            P02LA3_A396EmprCod, P02LA3_A719PrdNum, P02LA3_A810RecFec, P02LA3_A807RecExiRea
            }
            , new Object[] {
            P02LA4_A396EmprCod, P02LA4_A415EntFecEnt, P02LA4_A719PrdNum, P02LA4_A11Albaran, P02LA4_A418EntUniEnt, P02LA4_A597LinEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Recuen ;
   private short A597LinEnt ;
   private short Gx_err ;
   private java.math.BigDecimal AV9EntUniEnt ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A418EntUniEnt ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A11Albaran ;
   private java.util.Date AV10FecIni ;
   private java.util.Date AV12PFecha ;
   private java.util.Date AV13Ufecha ;
   private java.util.Date A810RecFec ;
   private java.util.Date A415EntFecEnt ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02LA2_A396EmprCod ;
   private java.util.Date[] P02LA2_A810RecFec ;
   private String[] P02LA2_A719PrdNum ;
   private java.math.BigDecimal[] P02LA2_A807RecExiRea ;
   private String[] P02LA3_A396EmprCod ;
   private String[] P02LA3_A719PrdNum ;
   private java.util.Date[] P02LA3_A810RecFec ;
   private java.math.BigDecimal[] P02LA3_A807RecExiRea ;
   private String[] P02LA4_A396EmprCod ;
   private java.util.Date[] P02LA4_A415EntFecEnt ;
   private String[] P02LA4_A719PrdNum ;
   private String[] P02LA4_A11Albaran ;
   private java.math.BigDecimal[] P02LA4_A418EntUniEnt ;
   private short[] P02LA4_A597LinEnt ;
}

final  class pcalexi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LA2", "SELECT EmprCod, RecFec, PrdNum, RecExiRea FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LA3", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec, RecExiRea FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec < ? ORDER BY EmprCod, PrdNum, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LA4", "SELECT EmprCod, EntFecEnt, PrdNum, Albaran, EntUniEnt, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ? and EntFecEnt >= ?) AND (EntFecEnt <= ?) ORDER BY EmprCod, PrdNum, EntFecEnt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
      }
   }

}

