package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccmask extends GXProcedure
{
   public pccmask( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccmask.class ), "" );
   }

   public pccmask( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 )
   {
      pccmask.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      pccmask.this.AV12Ent = aP0[0];
      this.aP0 = aP0;
      pccmask.this.AV13Len = aP1[0];
      this.aP1 = aP1;
      pccmask.this.AV9Sal = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strSearch( AV12Ent, "@", 1) > 0 )
      {
         AV11Pos = (long)(GXutil.strSearch( AV12Ent, "@", 1)+1) ;
         AV10Tipo = GXutil.substring( AV12Ent, (int)(AV11Pos), 1) ;
         AV9Sal = GXutil.padl( "", (short)(AV13Len), AV10Tipo) ;
      }
      else
      {
         if ( GXutil.len( AV12Ent) == AV13Len )
         {
            AV9Sal = AV12Ent ;
         }
         else
         {
            AV9Sal = "ERROR" ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccmask.this.AV12Ent;
      this.aP1[0] = pccmask.this.AV13Len;
      this.aP2[0] = pccmask.this.AV9Sal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Tipo = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV13Len ;
   private long AV11Pos ;
   private String AV12Ent ;
   private String AV9Sal ;
   private String AV10Tipo ;
   private String[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
}

