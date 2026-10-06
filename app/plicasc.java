package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plicasc extends GXProcedure
{
   public plicasc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plicasc.class ), "" );
   }

   public plicasc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 )
   {
      plicasc.this.aP1 = new short[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 )
   {
      plicasc.this.AV9chrstr = aP0[0];
      this.aP0 = aP0;
      plicasc.this.AV8chrnum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10asctbl = httpContext.getMessage( "#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`{|}~ ", "") ;
      AV12cnt = (short)(1) ;
      while ( AV12cnt <= GXutil.len( AV10asctbl) )
      {
         AV11ascpos = (short)(35+AV12cnt-1) ;
         if ( GXutil.strcmp(AV9chrstr, GXutil.substring( AV10asctbl, AV12cnt, 1)) == 0 )
         {
            AV8chrnum = AV11ascpos ;
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV12cnt = (short)(AV12cnt+1) ;
      }
      AV8chrnum = (short)(101) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plicasc.this.AV9chrstr;
      this.aP1[0] = plicasc.this.AV8chrnum;
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
   private short AV12cnt ;
   private short AV11ascpos ;
   private short Gx_err ;
   private String AV9chrstr ;
   private String AV10asctbl ;
   private boolean returnInSub ;
   private short[] aP1 ;
   private String[] aP0 ;
}

