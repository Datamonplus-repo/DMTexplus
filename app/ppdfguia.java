package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppdfguia extends GXProcedure
{
   public ppdfguia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppdfguia.class ), "" );
   }

   public ppdfguia( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      ppdfguia.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      ppdfguia.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppdfguia.this.AV24Albprocod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppdfguia.this.A396EmprCod;
      this.aP1[0] = ppdfguia.this.AV24Albprocod;
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
   private long AV24Albprocod ;
   private String A396EmprCod ;
   private long[] aP1 ;
   private String[] aP0 ;
}

