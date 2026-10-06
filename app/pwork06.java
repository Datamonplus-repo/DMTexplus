package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwork06 extends GXProcedure
{
   public pwork06( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwork06.class ), "" );
   }

   public pwork06( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             java.util.Date[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      pwork06.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        java.util.Date[] aP2 ,
                        short[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             java.util.Date[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 )
   {
      pwork06.this.AV8Emprcod = aP0[0];
      this.aP0 = aP0;
      pwork06.this.AV9Mancod = aP1[0];
      this.aP1 = aP1;
      pwork06.this.AV10RpExHdFe = aP2[0];
      this.aP2 = aP2;
      pwork06.this.AV22RpExHdLi = aP3[0];
      this.aP3 = aP3;
      pwork06.this.AV24oldcns = aP4[0];
      this.aP4 = aP4;
      pwork06.this.AV23oldkgs = aP5[0];
      this.aP5 = aP5;
      pwork06.this.AV25oldmts = aP6[0];
      this.aP6 = aP6;
      pwork06.this.AV18RpExHdCns = aP7[0];
      this.aP7 = aP7;
      pwork06.this.AV17RpExHdKgs = aP8[0];
      this.aP8 = aP8;
      pwork06.this.AV20RpExHdMts = aP9[0];
      this.aP9 = aP9;
      pwork06.this.AV19RpExHdTip = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n2717RpExHdTip = false ;
      n2847RpExHdMts = false ;
      n2716RpExHdCns = false ;
      n2715RpExHdKgs = false ;
      /* Optimized UPDATE. */
      /* Using cursor P05YE2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n2717RpExHdTip), AV19RpExHdTip, AV25oldmts, AV20RpExHdMts, Short.valueOf(AV24oldcns), Short.valueOf(AV18RpExHdCns), AV23oldkgs, AV17RpExHdKgs, AV8Emprcod, Short.valueOf(AV9Mancod), AV10RpExHdFe, Short.valueOf(AV22RpExHdLi)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwork06.this.AV8Emprcod;
      this.aP1[0] = pwork06.this.AV9Mancod;
      this.aP2[0] = pwork06.this.AV10RpExHdFe;
      this.aP3[0] = pwork06.this.AV22RpExHdLi;
      this.aP4[0] = pwork06.this.AV24oldcns;
      this.aP5[0] = pwork06.this.AV23oldkgs;
      this.aP6[0] = pwork06.this.AV25oldmts;
      this.aP7[0] = pwork06.this.AV18RpExHdCns;
      this.aP8[0] = pwork06.this.AV17RpExHdKgs;
      this.aP9[0] = pwork06.this.AV20RpExHdMts;
      this.aP10[0] = pwork06.this.AV19RpExHdTip;
      Application.commitDataStores(context, remoteHandle, pr_default, "pwork06");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A2717RpExHdTip = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pwork06__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9Mancod ;
   private short AV22RpExHdLi ;
   private short AV24oldcns ;
   private short AV18RpExHdCns ;
   private short Gx_err ;
   private java.math.BigDecimal AV23oldkgs ;
   private java.math.BigDecimal AV25oldmts ;
   private java.math.BigDecimal AV17RpExHdKgs ;
   private java.math.BigDecimal AV20RpExHdMts ;
   private String AV8Emprcod ;
   private String AV19RpExHdTip ;
   private String A2717RpExHdTip ;
   private java.util.Date AV10RpExHdFe ;
   private boolean n2717RpExHdTip ;
   private boolean n2847RpExHdMts ;
   private boolean n2716RpExHdCns ;
   private boolean n2715RpExHdKgs ;
   private String[] aP10 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private java.util.Date[] aP2 ;
   private short[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private IDataStoreProvider pr_default ;
}

final  class pwork06__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05YE2", "UPDATE TXPLREXHD SET RpExHdTip=?, RpExHdMts=RpExHdMts - ? + ?, RpExHdCns=RpExHdCns - ? + ?, RpExHdKgs=RpExHdKgs - ? + ?  WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? and RpExHdLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLREXHD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(8, (String)parms[8], 3);
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               return;
      }
   }

}

