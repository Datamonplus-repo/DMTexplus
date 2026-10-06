package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tbolpro_prxid extends GXProcedure
{
   public tbolpro_prxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbolpro_prxid.class ), "" );
   }

   public tbolpro_prxid( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          String aP1 ,
                          java.util.Date aP2 )
   {
      tbolpro_prxid.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             int[] aP3 )
   {
      tbolpro_prxid.this.AV8EmprCod = aP0;
      tbolpro_prxid.this.AV11maqcod = aP1;
      tbolpro_prxid.this.AV12Hisprofec = aP2;
      tbolpro_prxid.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09YL3 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV11maqcod, AV12Hisprofec});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P09YL3_A40000GXC1[0] ;
         n40000GXC1 = P09YL3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = 0 ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      GXt_int1 = AV13Paso ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "PARSTP", ""), GXv_int2) ;
      tbolpro_prxid.this.GXt_int1 = GXv_int2[0] ;
      AV13Paso = (short)(GXt_int1) ;
      AV13Paso = (short)(((0==AV13Paso) ? 1 : AV13Paso)) ;
      AV10HisProLin = (int)(A40000GXC1+AV13Paso) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = tbolpro_prxid.this.AV10HisProLin;
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
      P09YL3_A40000GXC1 = new int[1] ;
      P09YL3_n40000GXC1 = new boolean[] {false} ;
      GXv_int2 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.tbolpro_prxid__default(),
         new Object[] {
             new Object[] {
            P09YL3_A40000GXC1, P09YL3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13Paso ;
   private short Gx_err ;
   private int AV10HisProLin ;
   private int A40000GXC1 ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private String AV8EmprCod ;
   private String AV11maqcod ;
   private String scmdbuf ;
   private java.util.Date AV12Hisprofec ;
   private boolean n40000GXC1 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P09YL3_A40000GXC1 ;
   private boolean[] P09YL3_n40000GXC1 ;
}

final  class tbolpro_prxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YL3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(HisProLin) AS GXC1 FROM TXPLHIPRO WHERE (EmprCod = ?) AND (MaqCod = ?) AND (HisProFec = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
      }
   }

}

