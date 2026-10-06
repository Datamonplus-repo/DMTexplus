package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprmqfa extends GXProcedure
{
   public pprmqfa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprmqfa.class ), "" );
   }

   public pprmqfa( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 )
   {
      pprmqfa.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      pprmqfa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprmqfa.this.AV8FasCod = aP1[0];
      this.aP1 = aP1;
      pprmqfa.this.AV9MaqCodF = aP2[0];
      this.aP2 = aP2;
      pprmqfa.this.AV10MaqAnc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV11ConfAnc, httpContext.getMessage( "S", "")) == 0 )
      {
         httpContext.wjLoc = formatLink("app.tprmqfa", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8FasCod)),GXutil.URLEncode(GXutil.rtrim(AV9MaqCodF))}, new String[] {"EmprCod","FasCod","MaqCodF"})  ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprmqfa.this.A396EmprCod;
      this.aP1[0] = pprmqfa.this.AV8FasCod;
      this.aP2[0] = pprmqfa.this.AV9MaqCodF;
      this.aP3[0] = pprmqfa.this.AV10MaqAnc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11ConfAnc = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10MaqAnc ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8FasCod ;
   private String AV9MaqCodF ;
   private String AV11ConfAnc ;
   private short[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
}

