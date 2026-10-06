package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class maparlqbulk extends GXProcedure
{
   public maparlqbulk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( maparlqbulk.class ), "" );
   }

   public maparlqbulk( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String aP1 ,
                              java.util.Date aP2 ,
                              String aP3 ,
                              String aP4 ,
                              GXBaseCollection<app.ingenieria.SdtMRParProSDT>[] aP5 )
   {
      maparlqbulk.this.aP6 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        String aP4 ,
                        GXBaseCollection<app.ingenieria.SdtMRParProSDT>[] aP5 ,
                        boolean[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             String aP4 ,
                             GXBaseCollection<app.ingenieria.SdtMRParProSDT>[] aP5 ,
                             boolean[] aP6 )
   {
      maparlqbulk.this.AV16MAParLqUsu = aP0;
      maparlqbulk.this.AV10MAParLqIp = aP1;
      maparlqbulk.this.AV14MAParLqReg = aP2;
      maparlqbulk.this.AV15MAParLqTkn = aP3;
      maparlqbulk.this.AV11MAParLqMaqCod = aP4;
      maparlqbulk.this.aP5 = aP5;
      maparlqbulk.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Existe = false ;
      AV13MAParLqoSDTCollection.clear();
      /* Using cursor P0AVF2 */
      pr_default.execute(0, new Object[] {AV16MAParLqUsu, AV10MAParLqIp, AV14MAParLqReg, AV15MAParLqTkn, AV11MAParLqMaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14824MAParLqMaq = P0AVF2_A14824MAParLqMaq[0] ;
         A14822MAParLqTkn = P0AVF2_A14822MAParLqTkn[0] ;
         A14821MAParLqReg = P0AVF2_A14821MAParLqReg[0] ;
         A14820MAParLqIp = P0AVF2_A14820MAParLqIp[0] ;
         A14819MAParLqUsu = P0AVF2_A14819MAParLqUsu[0] ;
         A14815MAParLqId = P0AVF2_A14815MAParLqId[0] ;
         A14817MAParLqDsc = P0AVF2_A14817MAParLqDsc[0] ;
         AV12MAParLqoSDT = (app.ingenieria.SdtMRParProSDT)new app.ingenieria.SdtMRParProSDT(remoteHandle, context);
         AV12MAParLqoSDT.setgxTv_SdtMRParProSDT_Mrparprid( A14815MAParLqId );
         AV12MAParLqoSDT.setgxTv_SdtMRParProSDT_Mrparprdsc( A14817MAParLqDsc );
         AV13MAParLqoSDTCollection.add(AV12MAParLqoSDT, 0);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "%1--%2", A14824MAParLqMaq, A14817MAParLqDsc, "", "", "", "", "", "", ""), AV20Pgmdesc) ;
         AV8Existe = true ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = maparlqbulk.this.AV13MAParLqoSDTCollection;
      this.aP6[0] = maparlqbulk.this.AV8Existe;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13MAParLqoSDTCollection = new GXBaseCollection<app.ingenieria.SdtMRParProSDT>(app.ingenieria.SdtMRParProSDT.class, "MRParProSDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0AVF2_A14824MAParLqMaq = new String[] {""} ;
      P0AVF2_A14822MAParLqTkn = new String[] {""} ;
      P0AVF2_A14821MAParLqReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AVF2_A14820MAParLqIp = new String[] {""} ;
      P0AVF2_A14819MAParLqUsu = new String[] {""} ;
      P0AVF2_A14815MAParLqId = new long[1] ;
      P0AVF2_A14817MAParLqDsc = new String[] {""} ;
      A14824MAParLqMaq = "" ;
      A14822MAParLqTkn = "" ;
      A14821MAParLqReg = GXutil.resetTime( GXutil.nullDate() );
      A14820MAParLqIp = "" ;
      A14819MAParLqUsu = "" ;
      A14817MAParLqDsc = "" ;
      AV12MAParLqoSDT = new app.ingenieria.SdtMRParProSDT(remoteHandle, context);
      AV20Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.maparlqbulk__default(),
         new Object[] {
             new Object[] {
            P0AVF2_A14824MAParLqMaq, P0AVF2_A14822MAParLqTkn, P0AVF2_A14821MAParLqReg, P0AVF2_A14820MAParLqIp, P0AVF2_A14819MAParLqUsu, P0AVF2_A14815MAParLqId, P0AVF2_A14817MAParLqDsc
            }
         }
      );
      AV20Pgmdesc = httpContext.getMessage( "MAPar Lq Bulk", "") ;
      /* GeneXus formulas. */
      AV20Pgmdesc = httpContext.getMessage( "MAPar Lq Bulk", "") ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A14815MAParLqId ;
   private String AV16MAParLqUsu ;
   private String AV11MAParLqMaqCod ;
   private String scmdbuf ;
   private String A14824MAParLqMaq ;
   private String A14819MAParLqUsu ;
   private String AV20Pgmdesc ;
   private java.util.Date AV14MAParLqReg ;
   private java.util.Date A14821MAParLqReg ;
   private boolean AV8Existe ;
   private String AV10MAParLqIp ;
   private String AV15MAParLqTkn ;
   private String A14822MAParLqTkn ;
   private String A14820MAParLqIp ;
   private String A14817MAParLqDsc ;
   private boolean[] aP6 ;
   private GXBaseCollection<app.ingenieria.SdtMRParProSDT>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AVF2_A14824MAParLqMaq ;
   private String[] P0AVF2_A14822MAParLqTkn ;
   private java.util.Date[] P0AVF2_A14821MAParLqReg ;
   private String[] P0AVF2_A14820MAParLqIp ;
   private String[] P0AVF2_A14819MAParLqUsu ;
   private long[] P0AVF2_A14815MAParLqId ;
   private String[] P0AVF2_A14817MAParLqDsc ;
   private GXBaseCollection<app.ingenieria.SdtMRParProSDT> AV13MAParLqoSDTCollection ;
   private app.ingenieria.SdtMRParProSDT AV12MAParLqoSDT ;
}

final  class maparlqbulk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AVF2", "SELECT MAParLqMaq, MAParLqTkn, MAParLqReg, MAParLqIp, MAParLqUsu, MAParLqId, MAParLqDsc FROM MAParLq WHERE (MAParLqUsu = ?) AND (MAParLqIp = ?) AND (MAParLqReg = ?) AND (MAParLqTkn = ?) AND (MAParLqMaq = ?) ORDER BY MAParLqId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
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
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

