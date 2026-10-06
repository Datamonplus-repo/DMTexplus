package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tproces_trnwwexportcsv", "/app.ficherosbasicos.tproces_trnwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproces_trnwwexportcsv extends GXWebObjectStub
{
   public tproces_trnwwexportcsv( )
   {
   }

   public tproces_trnwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproces_trnwwexportcsv.class ));
   }

   public tproces_trnwwexportcsv( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproces_trnwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproces_trnwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TProces_TRNWWExport CSV";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

