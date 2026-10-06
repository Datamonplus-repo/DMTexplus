package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprepedwwexportcsv", "/app.tprepedwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprepedwwexportcsv extends GXWebObjectStub
{
   public tprepedwwexportcsv( )
   {
   }

   public tprepedwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprepedwwexportcsv.class ));
   }

   public tprepedwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprepedwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprepedwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPREPEDWWExport CSV";
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

