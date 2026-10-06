package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pstrlen extends GXProcedure
{
   public pstrlen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pstrlen.class ), "" );
   }

   public pstrlen( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 )
   {
      pstrlen.this.aP1 = new byte[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 )
   {
      pstrlen.this.AV15TxtLit = aP0[0];
      this.aP0 = aP0;
      pstrlen.this.AV16LonLit = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17ContCar = (byte)(50) ;
      AV16LonLit = (byte)(0) ;
      AV18Flag = (byte)(0) ;
      while ( AV18Flag == 0 )
      {
         if ( GXutil.strcmp(GXutil.substring( AV15TxtLit, AV17ContCar, 1), " ") != 0 )
         {
            AV18Flag = (byte)(1) ;
         }
         AV17ContCar = (byte)(AV17ContCar-1) ;
      }
      AV16LonLit = (byte)(AV17ContCar+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pstrlen.this.AV15TxtLit;
      this.aP1[0] = pstrlen.this.AV16LonLit;
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

   private byte AV16LonLit ;
   private byte AV17ContCar ;
   private byte AV18Flag ;
   private short Gx_err ;
   private String AV15TxtLit ;
   private byte[] aP1 ;
   private String[] aP0 ;
}

