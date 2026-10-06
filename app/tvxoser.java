package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxoser", "/app.tvxoser"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxoser extends GXWebObjectStub
{
   public tvxoser( )
   {
   }

   public tvxoser( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxoser.class ));
   }

   public tvxoser( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxoser_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxoser_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OSERCO en VertexFUERA DE USO";
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

