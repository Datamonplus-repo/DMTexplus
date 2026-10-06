package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisnorwwexportcsv", "/app.tdisnorwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisnorwwexportcsv extends GXWebObjectStub
{
   public tdisnorwwexportcsv( )
   {
   }

   public tdisnorwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisnorwwexportcsv.class ));
   }

   public tdisnorwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisnorwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisnorwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDISNORWWExport CSV";
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

