package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plicchr extends GXProcedure
{
   public plicchr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plicchr.class ), "" );
   }

   public plicchr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( short[] aP0 )
   {
      plicchr.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( short[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( short[] aP0 ,
                             String[] aP1 )
   {
      plicchr.this.AV8chrnum = aP0[0];
      this.aP0 = aP0;
      plicchr.this.AV9chrstr = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10asctbl = httpContext.getMessage( "#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`{|}~ ", "") ;
      AV11ascpos = (short)(AV8chrnum-35+1) ;
      AV9chrstr = GXutil.substring( AV10asctbl, AV11ascpos, 1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plicchr.this.AV8chrnum;
      this.aP1[0] = plicchr.this.AV9chrstr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10asctbl = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8chrnum ;
   private short AV11ascpos ;
   private short Gx_err ;
   private String AV9chrstr ;
   private String AV10asctbl ;
   private String[] aP1 ;
   private short[] aP0 ;
}

