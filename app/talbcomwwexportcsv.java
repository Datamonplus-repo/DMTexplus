package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbcomwwexportcsv", "/app.talbcomwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbcomwwexportcsv extends GXWebObjectStub
{
   public talbcomwwexportcsv( )
   {
   }

   public talbcomwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbcomwwexportcsv.class ));
   }

   public talbcomwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbcomwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbcomwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBCOMWWExport CSV";
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

