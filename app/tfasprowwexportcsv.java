package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasprowwexportcsv", "/app.tfasprowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasprowwexportcsv extends GXWebObjectStub
{
   public tfasprowwexportcsv( )
   {
   }

   public tfasprowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasprowwexportcsv.class ));
   }

   public tfasprowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasprowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasprowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFASPROWWExport CSV";
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

