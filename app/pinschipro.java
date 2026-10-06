package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinschipro extends GXProcedure
{
   public pinschipro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinschipro.class ), "" );
   }

   public pinschipro( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 )
   {
      pinschipro.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pinschipro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinschipro.this.AV8Maqcod = aP1[0];
      this.aP1 = aP1;
      pinschipro.this.AV9HisProfec = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Paso = 1 ;
      GXv_int1[0] = AV10Paso ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PARSTP", ""), GXv_int1) ;
      pinschipro.this.AV10Paso = GXv_int1[0] ;
      AV14GXLvl7 = (byte)(0) ;
      /* Using cursor P05KW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8Maqcod, AV9HisProfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A558HisProFec = P05KW2_A558HisProFec[0] ;
         A602MaqCod = P05KW2_A602MaqCod[0] ;
         AV14GXLvl7 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV14GXLvl7 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCHIPRO

         */
         A602MaqCod = AV8Maqcod ;
         A558HisProFec = AV9HisProfec ;
         A567HisProULin = AV10Paso ;
         n567HisProULin = false ;
         /* Using cursor P05KW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Boolean.valueOf(n567HisProULin), Integer.valueOf(A567HisProULin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIPRO");
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
         /* End Insert */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinschipro.this.A396EmprCod;
      this.aP1[0] = pinschipro.this.AV8Maqcod;
      this.aP2[0] = pinschipro.this.AV9HisProfec;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinschipro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      scmdbuf = "" ;
      P05KW2_A396EmprCod = new String[] {""} ;
      P05KW2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KW2_A602MaqCod = new String[] {""} ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinschipro__default(),
         new Object[] {
             new Object[] {
            P05KW2_A396EmprCod, P05KW2_A558HisProFec, P05KW2_A602MaqCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14GXLvl7 ;
   private short Gx_err ;
   private int AV10Paso ;
   private int GXv_int1[] ;
   private int GX_INS58 ;
   private int A567HisProULin ;
   private String A396EmprCod ;
   private String AV8Maqcod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String Gx_emsg ;
   private java.util.Date AV9HisProfec ;
   private java.util.Date A558HisProFec ;
   private boolean n567HisProULin ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05KW2_A396EmprCod ;
   private java.util.Date[] P05KW2_A558HisProFec ;
   private String[] P05KW2_A602MaqCod ;
}

final  class pinschipro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05KW2", "SELECT EmprCod, HisProFec, MaqCod FROM TXPCHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05KW3", "INSERT INTO TXPCHIPRO(EmprCod, MaqCod, HisProFec, HisProULin) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCHIPRO")
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               return;
      }
   }

}

