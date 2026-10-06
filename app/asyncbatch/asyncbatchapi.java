package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class asyncbatchapi extends GXProcedure
{
   public asyncbatchapi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( asyncbatchapi.class ), "" );
   }

   public asyncbatchapi( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11032( )
   {
      /* Setparameters_Before Routine */
      returnInSub = false ;
   }

   public void e12032( )
   {
      /* Setparameters_After Routine */
      returnInSub = false ;
   }

   public void gxep_setparameters__post( app.asyncbatch.SdtJobParameterData in_AV9JobData ,
                                         GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      this.AV9JobData = in_AV9JobData;
      initialize();
      initialized = (short)(1) ;
      arr_AV8Messages[0] = this.AV8Messages;
      e11032 ();
      if ( returnInSub )
      {
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      /* SetParameters__post Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV8Messages ;
      new app.asyncbatch.setparameter(remoteHandle, context).execute( AV9JobData, GXv_objcol_SdtMessages_Message1) ;
      AV8Messages = GXv_objcol_SdtMessages_Message1[0] ;
      e12032 ();
      if ( returnInSub )
      {
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      arr_AV8Messages[0] = this.AV8Messages;
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message1 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   protected short initialized ;
   protected short Gx_err ;
   protected boolean returnInSub ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV8Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message1[] ;
   protected app.asyncbatch.SdtJobParameterData AV9JobData ;
}

