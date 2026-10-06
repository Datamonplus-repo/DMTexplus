package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltdib extends GXProcedure
{
   public paltdib( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltdib.class ), "" );
   }

   public paltdib( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      paltdib.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      paltdib.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      paltdib.this.AV16DibCli = aP1[0];
      this.aP1 = aP1;
      paltdib.this.AV17CliCod = aP2[0];
      this.aP2 = aP2;
      paltdib.this.AV18DibInt = aP3[0];
      this.aP3 = aP3;
      paltdib.this.AV19UsurCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.wjLoc = formatLink("app.tdibdis", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV16DibCli)),GXutil.URLEncode(GXutil.ltrimstr(AV17CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18DibInt,8,0)),GXutil.URLEncode(GXutil.rtrim(AV19UsurCod))}, new String[] {"EmprCod","DibCli","CliCod","DibInt","UsurCod"})  ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paltdib.this.AV15EmprCod;
      this.aP1[0] = paltdib.this.AV16DibCli;
      this.aP2[0] = paltdib.this.AV17CliCod;
      this.aP3[0] = paltdib.this.AV18DibInt;
      this.aP4[0] = paltdib.this.AV19UsurCod;
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
   private int AV17CliCod ;
   private int AV18DibInt ;
   private String AV15EmprCod ;
   private String AV16DibCli ;
   private String AV19UsurCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
}

