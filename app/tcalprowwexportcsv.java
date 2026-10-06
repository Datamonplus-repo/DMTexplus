package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcalprowwexportcsv", "/app.tcalprowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcalprowwexportcsv extends GXWebObjectStub
{
   public tcalprowwexportcsv( )
   {
   }

   public tcalprowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcalprowwexportcsv.class ));
   }

   public tcalprowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcalprowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcalprowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCALPROWWExport CSV";
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

