package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phhmms extends GXProcedure
{
   public phhmms( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phhmms.class ), "" );
   }

   public phhmms( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           java.util.Date[] aP2 ,
                           String[] aP3 )
   {
      phhmms.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      phhmms.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phhmms.this.AV8AlbDoc = aP1[0];
      this.aP1 = aP1;
      phhmms.this.AV9FecSal = aP2[0];
      this.aP2 = aP2;
      phhmms.this.AV10ALbHorsal = aP3[0];
      this.aP3 = aP3;
      phhmms.this.AV11TipoDoc = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV11TipoDoc == 1 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P042T2 */
         pr_default.execute(0, new Object[] {AV10ALbHorsal, AV9FecSal, A396EmprCod, Integer.valueOf(AV8AlbDoc)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* End optimized UPDATE. */
      }
      else if ( AV11TipoDoc == 4 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P042T3 */
         pr_default.execute(1, new Object[] {AV10ALbHorsal, AV9FecSal, A396EmprCod, Integer.valueOf(AV8AlbDoc)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phhmms.this.A396EmprCod;
      this.aP1[0] = phhmms.this.AV8AlbDoc;
      this.aP2[0] = phhmms.this.AV9FecSal;
      this.aP3[0] = phhmms.this.AV10ALbHorsal;
      this.aP4[0] = phhmms.this.AV11TipoDoc;
      Application.commitDataStores(context, remoteHandle, pr_default, "phhmms");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A3865AlbHorSal = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A6396SalExtHor = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phhmms__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11TipoDoc ;
   private short Gx_err ;
   private int AV8AlbDoc ;
   private String A396EmprCod ;
   private String AV10ALbHorsal ;
   private String A3865AlbHorSal ;
   private String A6396SalExtHor ;
   private java.util.Date AV9FecSal ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date A2256SalExtFec ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class phhmms__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P042T2", "UPDATE TXPCALPRD SET AlbHorSal=?, AlbFecSal=?  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P042T3", "UPDATE TXPCEXTSA SET SalExtHor=?, SalExtFec=?  WHERE EmprCod = ? and SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

