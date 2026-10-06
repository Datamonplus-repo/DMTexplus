package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprer02 extends GXProcedure
{
   public pprer02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprer02.class ), "" );
   }

   public pprer02( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            short[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            byte[] aP6 ,
                            short[] aP7 )
   {
      pprer02.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 )
   {
      pprer02.this.AV19EmprCod = aP0[0];
      this.aP0 = aP0;
      pprer02.this.AV26RecPreCod = aP1[0];
      this.aP1 = aP1;
      pprer02.this.AV16LinRec = aP2[0];
      this.aP2 = aP2;
      pprer02.this.AV15PrdDesc = aP3[0];
      this.aP3 = aP3;
      pprer02.this.AV17PrdNum = aP4[0];
      this.aP4 = aP4;
      pprer02.this.AV27RecPreCan1 = aP5[0];
      this.aP5 = aP5;
      pprer02.this.AV23LinPro = aP6[0];
      this.aP6 = aP6;
      pprer02.this.AV24RecLinMaq = aP7[0];
      this.aP7 = aP7;
      pprer02.this.AV25UltRecLin = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25UltRecLin = (short)(AV16LinRec+10) ;
      AV16LinRec = (short)(AV16LinRec+10) ;
      /*
         INSERT RECORD ON TABLE TXPPRERLN

      */
      A396EmprCod = AV19EmprCod ;
      A4744RecPreCod = AV26RecPreCod ;
      A4762RecPreLin = AV23LinPro ;
      A4763RecPreNli = AV16LinRec ;
      A4764RecPrePrdN = AV17PrdNum ;
      n4764RecPrePrdN = false ;
      A4765RecPrePrdD = AV15PrdDesc ;
      n4765RecPrePrdD = false ;
      A4768RecPreCan1 = AV27RecPreCan1 ;
      n4768RecPreCan1 = false ;
      A4769RecPreCan2 = DecimalUtil.doubleToDec(0) ;
      n4769RecPreCan2 = false ;
      /* Using cursor P01C92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4744RecPreCod), Short.valueOf(A4762RecPreLin), Short.valueOf(A4763RecPreNli), Boolean.valueOf(n4764RecPrePrdN), A4764RecPrePrdN, Boolean.valueOf(n4765RecPrePrdD), A4765RecPrePrdD, Boolean.valueOf(n4768RecPreCan1), A4768RecPreCan1, Boolean.valueOf(n4769RecPreCan2), A4769RecPreCan2});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRERLN");
      if ( (pr_default.getStatus(0) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprer02.this.AV19EmprCod;
      this.aP1[0] = pprer02.this.AV26RecPreCod;
      this.aP2[0] = pprer02.this.AV16LinRec;
      this.aP3[0] = pprer02.this.AV15PrdDesc;
      this.aP4[0] = pprer02.this.AV17PrdNum;
      this.aP5[0] = pprer02.this.AV27RecPreCan1;
      this.aP6[0] = pprer02.this.AV23LinPro;
      this.aP7[0] = pprer02.this.AV24RecLinMaq;
      this.aP8[0] = pprer02.this.AV25UltRecLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprer02");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A4764RecPrePrdN = "" ;
      A4765RecPrePrdD = "" ;
      A4768RecPreCan1 = DecimalUtil.ZERO ;
      A4769RecPreCan2 = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprer02__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23LinPro ;
   private short AV16LinRec ;
   private short AV24RecLinMaq ;
   private short AV25UltRecLin ;
   private short A4762RecPreLin ;
   private short A4763RecPreNli ;
   private short Gx_err ;
   private int AV26RecPreCod ;
   private int GX_INS706 ;
   private int A4744RecPreCod ;
   private java.math.BigDecimal AV27RecPreCan1 ;
   private java.math.BigDecimal A4768RecPreCan1 ;
   private java.math.BigDecimal A4769RecPreCan2 ;
   private String AV19EmprCod ;
   private String AV15PrdDesc ;
   private String AV17PrdNum ;
   private String A396EmprCod ;
   private String A4764RecPrePrdN ;
   private String A4765RecPrePrdD ;
   private String Gx_emsg ;
   private boolean n4764RecPrePrdN ;
   private boolean n4765RecPrePrdD ;
   private boolean n4768RecPreCan1 ;
   private boolean n4769RecPreCan2 ;
   private short[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
}

final  class pprer02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01C92", "INSERT INTO TXPPRERLN(EmprCod, RecPreCod, RecPreLin, RecPreNli, RecPrePrdN, RecPrePrdD, RecPreCan1, RecPreCan2, PrdNum, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRERLN")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 26);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 3);
               }
               return;
      }
   }

}

