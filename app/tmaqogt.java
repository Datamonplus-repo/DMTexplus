package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqogt", "/app.tmaqogt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqogt extends GXWebObjectStub
{
   public tmaqogt( )
   {
   }

   public tmaqogt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqogt.class ));
   }

   public tmaqogt( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqogt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqogt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAQUINAS ORGATEX";
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

