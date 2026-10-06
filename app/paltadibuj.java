package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltadibuj extends GXProcedure
{
   public paltadibuj( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltadibuj.class ), "" );
   }

   public paltadibuj( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      paltadibuj.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      paltadibuj.this.AV20EmprCod = aP0[0];
      this.aP0 = aP0;
      paltadibuj.this.AV22DibCli = aP1[0];
      this.aP1 = aP1;
      paltadibuj.this.AV16CliCod = aP2[0];
      this.aP2 = aP2;
      paltadibuj.this.AV23DibInt = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.wjLoc = formatLink("app.tpdibuj", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV22DibCli)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV23DibInt,8,0))}, new String[] {"EmprCod","DibCli","CliCod","DibInt"})  ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paltadibuj.this.AV20EmprCod;
      this.aP1[0] = paltadibuj.this.AV22DibCli;
      this.aP2[0] = paltadibuj.this.AV16CliCod;
      this.aP3[0] = paltadibuj.this.AV23DibInt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16CliCod ;
   private int AV23DibInt ;
   private String AV20EmprCod ;
   private String AV22DibCli ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
}

