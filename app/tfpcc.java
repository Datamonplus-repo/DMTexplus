package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfpcc", "/app.tfpcc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfpcc extends GXWebObjectStub
{
   public tfpcc( )
   {
   }

   public tfpcc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfpcc.class ));
   }

   public tfpcc( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfpcc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfpcc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FASES QUE COMPONEN EL PROCESO";
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

