package app.asyncbatch ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class jobcreate extends GXProcedure
{
   public jobcreate( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( jobcreate.class ), "" );
   }

   public jobcreate( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( java.util.UUID aP0 ,
                              String aP1 ,
                              GXBaseCollection<app.asyncbatch.SdtJobItemSdt_Item> aP2 ,
                              String aP3 ,
                              String aP4 )
   {
      jobcreate.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( java.util.UUID aP0 ,
                        String aP1 ,
                        GXBaseCollection<app.asyncbatch.SdtJobItemSdt_Item> aP2 ,
                        String aP3 ,
                        String aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( java.util.UUID aP0 ,
                             String aP1 ,
                             GXBaseCollection<app.asyncbatch.SdtJobItemSdt_Item> aP2 ,
                             String aP3 ,
                             String aP4 ,
                             boolean[] aP5 )
   {
      jobcreate.this.AV8JobId = aP0;
      jobcreate.this.AV9JobType = aP1;
      jobcreate.this.AV12ItensSDT = aP2;
      jobcreate.this.AV10BasePath = aP3;
      jobcreate.this.AV11OutPath = aP4;
      jobcreate.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37TotItem = 0 ;
      GXv_SdtWWPContext1[0] = AV15WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV15WWPContext = GXv_SdtWWPContext1[0] ;
      AV38Year = (short)(GXutil.year( Gx_date)) ;
      AV39Day = (byte)(GXutil.day( Gx_date)) ;
      AV40Mounth = (byte)(GXutil.month( Gx_date)) ;
      AV37TotItem = AV12ItensSDT.size() ;
      AV45Bar = "\\" ;
      AV23JOB.setgxTv_SdtJOB_Jobid( AV8JobId );
      AV23JOB.setgxTv_SdtJOB_Jobdesc( GXutil.format( httpContext.getMessage( "Creado en %1 documentos. Cantidad : %2 .", ""), GXutil.format( "%1/%2/%3", localUtil.format( DecimalUtil.doubleToDec(AV39Day), "99"), localUtil.format( DecimalUtil.doubleToDec(AV40Mounth), "99"), localUtil.format( DecimalUtil.doubleToDec(AV38Year), "ZZZ9"), "", "", "", "", "", ""), GXutil.str( AV12ItensSDT.size(), 9, 0), "", "", "", "", "", "", "") );
      AV46JobExec = "" ;
      if ( GXutil.strcmp(AV9JobType, "FATURA") == 0 )
      {
         AV46JobExec = "facturacion.runimpressionfactura" ;
      }
      else if ( GXutil.strcmp(AV9JobType, "REMESSA") == 0 )
      {
         AV46JobExec = "facturacion.runimpressionremessa" ;
      }
      else if ( GXutil.strcmp(AV9JobType, "ALBARAN") == 0 )
      {
         AV46JobExec = "facturacion.runimpressionalbaran" ;
      }
      AV23JOB.setgxTv_SdtJOB_Jobexec( AV46JobExec );
      AV23JOB.setgxTv_SdtJOB_Jobtype( AV9JobType );
      AV23JOB.setgxTv_SdtJOB_Basepath( GXutil.format( "%1%2", GXutil.trim( AV10BasePath), AV45Bar, "", "", "", "", "", "", "") );
      AV23JOB.setgxTv_SdtJOB_Jobstat( "WAINTING" );
      AV23JOB.setgxTv_SdtJOB_Usrcreat( AV15WWPContext.getgxTv_SdtWWPContext_Userguid().toString() );
      AV23JOB.setgxTv_SdtJOB_Usrsocket( AV15WWPContext.getgxTv_SdtWWPContext_Usursockt() );
      AV23JOB.setgxTv_SdtJOB_Dtcreat( GXutil.now( ) );
      AV23JOB.setgxTv_SdtJOB_Totitem( AV37TotItem );
      AV23JOB.setgxTv_SdtJOB_Prcitem( 0 );
      AV23JOB.setgxTv_SdtJOB_Okitem( 0 );
      AV23JOB.setgxTv_SdtJOB_Eritem( 0 );
      AV23JOB.setgxTv_SdtJOB_Prgpct( (short)(0) );
      AV23JOB.setgxTv_SdtJOB_Outpath( GXutil.format( "%1%2", GXutil.trim( AV11OutPath), AV45Bar, "", "", "", "", "", "", "") );
      AV23JOB.setgxTv_SdtJOB_Dtstart_SetNull();
      AV23JOB.setgxTv_SdtJOB_Dtend_SetNull();
      AV23JOB.setgxTv_SdtJOB_Curitem_SetNull();
      AV23JOB.setgxTv_SdtJOB_Zippath_SetNull();
      AV23JOB.setgxTv_SdtJOB_Zipurl_SetNull();
      AV23JOB.setgxTv_SdtJOB_Lasterr_SetNull();
      AV23JOB.setgxTv_SdtJOB_Lockid_SetNull();
      AV23JOB.setgxTv_SdtJOB_Lockdt_SetNull();
      AV23JOB.Save();
      if ( AV23JOB.Success() )
      {
         AV17isOk = true ;
         Application.commitDataStores(context, remoteHandle, pr_default, "asyncbatch.jobcreate");
         /* Execute user subroutine: 'JOBITEM_DATA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         AV51GXV2 = 1 ;
         AV50GXV1 = AV23JOB.GetMessages() ;
         while ( AV51GXV2 <= AV50GXV1.size() )
         {
            AV25Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV50GXV1.elementAt(-1+AV51GXV2));
            System.out.println( AV25Message.getgxTv_SdtMessages_Message_Description() );
            AV51GXV2 = (int)(AV51GXV2+1) ;
         }
         Application.rollbackDataStores(context, remoteHandle, pr_default, "asyncbatch.jobcreate");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'JOBITEM_DATA' Routine */
      returnInSub = false ;
      AV29x = (short)(0) ;
      AV52GXV3 = 1 ;
      while ( AV52GXV3 <= AV12ItensSDT.size() )
      {
         AV34JobItemSDT = (app.asyncbatch.SdtJobItemSdt_Item)((app.asyncbatch.SdtJobItemSdt_Item)AV12ItensSDT.elementAt(-1+AV52GXV3));
         AV29x = (short)(AV29x+1) ;
         AV28JobItem.setgxTv_SdtJOBITEM_Jobid( AV8JobId );
         AV28JobItem.setgxTv_SdtJOBITEM_Itmid( AV29x );
         AV28JobItem.setgxTv_SdtJOBITEM_Docid( AV34JobItemSDT.getgxTv_SdtJobItemSdt_Item_Docid() );
         AV28JobItem.setgxTv_SdtJOBITEM_Doclbl( AV34JobItemSDT.getgxTv_SdtJobItemSdt_Item_Doclbl() );
         AV28JobItem.setgxTv_SdtJOBITEM_Itmsts( AV34JobItemSDT.getgxTv_SdtJobItemSdt_Item_Itmsts() );
         AV28JobItem.setgxTv_SdtJOBITEM_Retryqt( AV34JobItemSDT.getgxTv_SdtJobItemSdt_Item_Retryqt() );
         AV28JobItem.setgxTv_SdtJOBITEM_Itmdtstart( AV34JobItemSDT.getgxTv_SdtJobItemSdt_Item_Itmdtstart() );
         AV28JobItem.setgxTv_SdtJOBITEM_Itmdtend( AV34JobItemSDT.getgxTv_SdtJobItemSdt_Item_Itmdtstart() );
         AV28JobItem.setgxTv_SdtJOBITEM_Outfile( AV34JobItemSDT.getgxTv_SdtJobItemSdt_Item_Outfile() );
         AV28JobItem.setgxTv_SdtJOBITEM_Outurl( AV34JobItemSDT.getgxTv_SdtJobItemSdt_Item_Outurl() );
         AV28JobItem.setgxTv_SdtJOBITEM_Filenm( AV34JobItemSDT.getgxTv_SdtJobItemSdt_Item_Filenm() );
         AV28JobItem.Save();
         if ( AV28JobItem.Success() )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "asyncbatch.jobcreate");
         }
         else
         {
            AV54GXV5 = 1 ;
            AV53GXV4 = AV28JobItem.GetMessages() ;
            while ( AV54GXV5 <= AV53GXV4.size() )
            {
               AV25Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV53GXV4.elementAt(-1+AV54GXV5));
               System.out.println( AV25Message.getgxTv_SdtMessages_Message_Description() );
               AV54GXV5 = (int)(AV54GXV5+1) ;
            }
            Application.rollbackDataStores(context, remoteHandle, pr_default, "asyncbatch.jobcreate");
         }
         AV52GXV3 = (int)(AV52GXV3+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = jobcreate.this.AV17isOk;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      Gx_date = GXutil.nullDate() ;
      AV45Bar = "" ;
      AV23JOB = new app.asyncbatch.SdtJOB(remoteHandle);
      AV46JobExec = "" ;
      AV50GXV1 = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV25Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV34JobItemSDT = new app.asyncbatch.SdtJobItemSdt_Item(remoteHandle, context);
      AV28JobItem = new app.asyncbatch.SdtJOBITEM(remoteHandle);
      AV53GXV4 = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobcreate__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobcreate__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobcreate__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobcreate__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobcreate__default(),
         new Object[] {
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV39Day ;
   private byte AV40Mounth ;
   private short AV38Year ;
   private short AV29x ;
   private short Gx_err ;
   private int AV51GXV2 ;
   private int AV52GXV3 ;
   private int AV54GXV5 ;
   private long AV37TotItem ;
   private String AV45Bar ;
   private java.util.Date Gx_date ;
   private boolean AV17isOk ;
   private boolean returnInSub ;
   private String AV9JobType ;
   private String AV10BasePath ;
   private String AV11OutPath ;
   private String AV46JobExec ;
   private java.util.UUID AV8JobId ;
   private app.asyncbatch.SdtJOB AV23JOB ;
   private app.asyncbatch.SdtJOBITEM AV28JobItem ;
   private boolean[] aP5 ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private GXBaseCollection<app.asyncbatch.SdtJobItemSdt_Item> AV12ItensSDT ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV50GXV1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV53GXV4 ;
   private com.genexus.SdtMessages_Message AV25Message ;
   private app.asyncbatch.SdtJobItemSdt_Item AV34JobItemSDT ;
   private app.wwpbaseobjects.SdtWWPContext AV15WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class jobcreate__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class jobcreate__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class jobcreate__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class jobcreate__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class jobcreate__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

