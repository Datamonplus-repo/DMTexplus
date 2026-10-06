package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmrcomww", "/app.tmrcomww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrcomww extends GXWebObjectStub
{
   public tmrcomww( )
   {
   }

   public tmrcomww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrcomww.class ));
   }

   public tmrcomww( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrcomww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrcomww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Repuestos Compatibles";
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

