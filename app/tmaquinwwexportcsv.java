package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaquinwwexportcsv", "/app.tmaquinwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaquinwwexportcsv extends GXWebObjectStub
{
   public tmaquinwwexportcsv( )
   {
   }

   public tmaquinwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaquinwwexportcsv.class ));
   }

   public tmaquinwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaquinwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaquinwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMAQUINWWExport CSV";
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

