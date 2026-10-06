package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.vistatmrcom", "/app.vistatmrcom"})
@jakarta.servlet.annotation.MultipartConfig
public final  class vistatmrcom extends GXWebObjectStub
{
   public vistatmrcom( )
   {
   }

   public vistatmrcom( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( vistatmrcom.class ));
   }

   public vistatmrcom( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new vistatmrcom_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new vistatmrcom_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Vista TMRCom";
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

