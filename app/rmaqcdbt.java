package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rmaqcdbt", "/app.rmaqcdbt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmaqcdbt extends GXWebObjectStub
{
   public rmaqcdbt( )
   {
   }

   public rmaqcdbt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmaqcdbt.class ));
   }

   public rmaqcdbt( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmaqcdbt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmaqcdbt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CODIGO BARRAS, MAQUINA";
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

