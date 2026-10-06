package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tposalm", "/app.tposalm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tposalm extends GXWebObjectStub
{
   public tposalm( )
   {
   }

   public tposalm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tposalm.class ));
   }

   public tposalm( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tposalm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tposalm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "POSICIONES ALMACEN PARA BOTAS";
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

