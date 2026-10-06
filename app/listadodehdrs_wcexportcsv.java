package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listadodehdrs_wcexportcsv", "/app.listadodehdrs_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodehdrs_wcexportcsv extends GXWebObjectStub
{
   public listadodehdrs_wcexportcsv( )
   {
   }

   public listadodehdrs_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodehdrs_wcexportcsv.class ));
   }

   public listadodehdrs_wcexportcsv( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodehdrs_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodehdrs_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listadode HDRs_WCExport CSV";
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

