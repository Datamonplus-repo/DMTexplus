package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrparprobulk extends GXProcedure
{
   public mrparprobulk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrparprobulk.class ), "" );
   }

   public mrparprobulk( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String aP1 ,
                              java.util.Date aP2 ,
                              String aP3 ,
                              GXBaseCollection<app.ingenieria.SdtMRParProSDT>[] aP4 )
   {
      mrparprobulk.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        GXBaseCollection<app.ingenieria.SdtMRParProSDT>[] aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             GXBaseCollection<app.ingenieria.SdtMRParProSDT>[] aP4 ,
                             boolean[] aP5 )
   {
      mrparprobulk.this.AV11MRParPrUsu = aP0;
      mrparprobulk.this.AV12MRParPrIp = aP1;
      mrparprobulk.this.AV13MRParPrReg = aP2;
      mrparprobulk.this.AV14MRParPrTkn = aP3;
      mrparprobulk.this.aP4 = aP4;
      mrparprobulk.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Existe = false ;
      AV10MRParPrPLC = "" ;
      AV16MRParProSDTCollection.clear();
      /* Using cursor P0AVB2 */
      pr_default.execute(0, new Object[] {AV11MRParPrUsu, AV12MRParPrIp, AV13MRParPrReg, AV14MRParPrTkn});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14783MRParPrTkn = P0AVB2_A14783MRParPrTkn[0] ;
         A14782MRParPrReg = P0AVB2_A14782MRParPrReg[0] ;
         A14781MRParPrIp = P0AVB2_A14781MRParPrIp[0] ;
         A14780MRParPrUsu = P0AVB2_A14780MRParPrUsu[0] ;
         A14680MRParPrId = P0AVB2_A14680MRParPrId[0] ;
         A14779MRParPrDsc = P0AVB2_A14779MRParPrDsc[0] ;
         AV15MRParProSDT = (app.ingenieria.SdtMRParProSDT)new app.ingenieria.SdtMRParProSDT(remoteHandle, context);
         AV15MRParProSDT.setgxTv_SdtMRParProSDT_Mrparprid( A14680MRParPrId );
         AV15MRParProSDT.setgxTv_SdtMRParProSDT_Mrparprdsc( A14779MRParPrDsc );
         AV16MRParProSDTCollection.add(AV15MRParProSDT, 0);
         AV8Existe = true ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = mrparprobulk.this.AV16MRParProSDTCollection;
      this.aP5[0] = mrparprobulk.this.AV8Existe;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16MRParProSDTCollection = new GXBaseCollection<app.ingenieria.SdtMRParProSDT>(app.ingenieria.SdtMRParProSDT.class, "MRParProSDT", "TexplusNET", remoteHandle);
      AV10MRParPrPLC = "" ;
      scmdbuf = "" ;
      P0AVB2_A14783MRParPrTkn = new String[] {""} ;
      P0AVB2_A14782MRParPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AVB2_A14781MRParPrIp = new String[] {""} ;
      P0AVB2_A14780MRParPrUsu = new String[] {""} ;
      P0AVB2_A14680MRParPrId = new long[1] ;
      P0AVB2_A14779MRParPrDsc = new String[] {""} ;
      A14783MRParPrTkn = "" ;
      A14782MRParPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14781MRParPrIp = "" ;
      A14780MRParPrUsu = "" ;
      A14779MRParPrDsc = "" ;
      AV15MRParProSDT = new app.ingenieria.SdtMRParProSDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrparprobulk__default(),
         new Object[] {
             new Object[] {
            P0AVB2_A14783MRParPrTkn, P0AVB2_A14782MRParPrReg, P0AVB2_A14781MRParPrIp, P0AVB2_A14780MRParPrUsu, P0AVB2_A14680MRParPrId, P0AVB2_A14779MRParPrDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A14680MRParPrId ;
   private String AV11MRParPrUsu ;
   private String scmdbuf ;
   private String A14780MRParPrUsu ;
   private java.util.Date AV13MRParPrReg ;
   private java.util.Date A14782MRParPrReg ;
   private boolean AV8Existe ;
   private String AV12MRParPrIp ;
   private String AV14MRParPrTkn ;
   private String AV10MRParPrPLC ;
   private String A14783MRParPrTkn ;
   private String A14781MRParPrIp ;
   private String A14779MRParPrDsc ;
   private boolean[] aP5 ;
   private GXBaseCollection<app.ingenieria.SdtMRParProSDT>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AVB2_A14783MRParPrTkn ;
   private java.util.Date[] P0AVB2_A14782MRParPrReg ;
   private String[] P0AVB2_A14781MRParPrIp ;
   private String[] P0AVB2_A14780MRParPrUsu ;
   private long[] P0AVB2_A14680MRParPrId ;
   private String[] P0AVB2_A14779MRParPrDsc ;
   private GXBaseCollection<app.ingenieria.SdtMRParProSDT> AV16MRParProSDTCollection ;
   private app.ingenieria.SdtMRParProSDT AV15MRParProSDT ;
}

final  class mrparprobulk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AVB2", "SELECT MRParPrTkn, MRParPrReg, MRParPrIp, MRParPrUsu, MRParPrId, MRParPrDsc FROM MRParPr WHERE (MRParPrUsu = ?) AND (MRParPrIp = ?) AND (MRParPrReg = ?) AND (MRParPrTkn = ?) ORDER BY MRParPrId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 20);
               stmt.setDateTime(3, (java.util.Date)parms[2], false, true);
               stmt.setVarchar(4, (String)parms[3], 256);
               return;
      }
   }

}

