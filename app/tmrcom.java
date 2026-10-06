package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmrcom", "/app.tmrcom"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrcom extends GXWebObjectStub
{
   public tmrcom( )
   {
   }

   public tmrcom( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrcom.class ));
   }

   public tmrcom( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrcom_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrcom_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Repuestos Compatibles";
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

